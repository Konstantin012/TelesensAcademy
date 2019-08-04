package com.academy.Lesson05.task01;


import com.academy.Lesson06.enamTask.DifFormates;
import com.academy.Lesson06.enamTask.MonthsEnum;

import java.security.PublicKey;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;


public class Date extends Months {
    private int day;
    private int month;
    private int year;


    public Date() {
        this.day = 1;
        this.month = 01;
        this.year = 1970;
    }

    public Date(int day, int month, int year) {

        checkForCheckData(day, month, year);
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(Date date) {
        day = date.day;
        month = date.month;
        year = date.year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        checkForCheckData(day, this.month, this.year);
        if (day > 0 | day <= 31) {
            this.day = day;
        } else {
            System.out.println("Inccorect day");
        }
    }

    public void setMonth(int month) {
        checkForCheckData(this.day, month, this.year);
        if (month > 0 | month <= 12) {
            this.month = month;
        } else {
            System.out.println("Inccorect month");
        }

    }

    public void setYear(int year) {
        checkForCheckData(this.day, this.month, year);
        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR);
        if (year > 0 | year <= currentYear) {
            this.year = year;
        } else {
            System.out.println("Inccorect year");
        }

    }


    //возвращает день недели: пн, вт, ср и тд
    public String getDayOfWeek(int count) {
        String dayOfWeek = "";
        switch (count) {
            case (1):
                dayOfWeek = "Monday";
                break;
            case (2):
                dayOfWeek = "Tuesday";
                break;
            case (3):
                dayOfWeek = "Wednesday";
                break;
            case (4):
                dayOfWeek = "Thursday";
                break;
            case (5):
                dayOfWeek = "Friday";
                break;
            case (6):
                dayOfWeek = "Saturday";
                break;
            case (7):
                dayOfWeek = "Sunday";
                break;
        }
        return dayOfWeek;
    }

    //вычисляет номер недели в году
    public int getNumberOfYearsWeek(int day, int month) {
        int currentdays = returnMonthsDays(month);
        int restOfDdaysInCurrentMonth = currentdays - day;
        int temp = 0;
        for (int i = 1; i < +month; i++) {
            temp += returnMonthsDays(i);
        }
        int currentWeek = (temp + restOfDdaysInCurrentMonth) / 7;
        int module = (temp + restOfDdaysInCurrentMonth) % 7;
        if (module > 0) {
            currentWeek++;
        }
        return currentWeek;
    }

    //увеличивают на единицу значение дня
    public Date nextDay() {
        setDay(++day);
        addDays(0);
        return this;
    }

    //увеличивают на единицу значение месяца
    public Date nextMonth() {
        setMonth(++month);
        addDays(0);
        return this;
    }

    //увеличивают на единицу значение года
    public Date nextYear() {
        setYear(++year);
        return this;
    }

    //    добавляет кол-во дней 'days' к текущей  дате
    public void addDays(int days) {
        int currentdays = returnMonthsDays(month);
        this.day += days;
        if (this.day > currentdays) {
            //устанавливаем новую дату в новом месяце
            setDay(day - currentdays);
            if (this.month == 12) {
                setMonth(1);
                nextYear();
            } else {
                nextMonth();
            }
        }
    }


    //метод checkData(int day, int month, int year), который проверяет существование введенной даты
    //какие еще случаи можно проверить?
    public boolean checkData(int day, int month, int year) {
        if (day > 0 & day <= 31 & month > 0 & month <= 12 & year > 0 & year <= 2019) {
//            String dateTemp = day + "." + month + "." + year;
//            System.out.println("Введенная дата: " + dateTemp);
            return true;
        } else {
            System.out.println("Incorrect date");
            return false;
        }

    }

    public void checkForCheckData(int day, int month, int year) {
        try {
            assert checkData(day, month, year);
        } catch (Exception e) {
            System.out.println("Incorrect Data!");
        }
    }

    @Override
    public String toString() {
        return (changeTypeOfString(day) + "." + changeTypeOfString(month) + "." + year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return day == date.day &&
                month == date.month &&
                year == date.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    public void printData() {

        System.out.println(day + month + year);

    }

    public String changeTypeOfString(int number) {
        if (String.valueOf(number).length() < 2) {
            String newNumber = String.valueOf(number);
            return ("0" + newNumber);
        }
        return String.valueOf(number);
    }


    //НЕ РАБОТАЕТ
    public void print(DifFormates.DateFormat format) {
        String newFormat = format.getFormat();
        String oldFormat = "dd.MM.yyyy";
        String currentDate = this.toString();

        SimpleDateFormat myDateFormat = new SimpleDateFormat(oldFormat); //Задали шаблон входящей строки

        try {
            java.util.Date date = myDateFormat.parse(currentDate); //получили дату
            myDateFormat.applyPattern(newFormat); //изменили шаблон
            currentDate = myDateFormat.format(date);     //получили дату в нужном формате
            System.out.println(currentDate);             //вывели результат на печать
        } catch (ParseException e) {
            System.out.println("Invalid Date Parser Exception");
        }
    }


    public String printTest(Date yourDate, DifFormates.DateFormat yourFormat) {

        if (yourFormat.name().equals(DifFormates.DateFormat.valueOf("RU").name()))
            return (changeTypeOfString(yourDate.day) + "." + changeTypeOfString(yourDate.month) + "." + yourDate.year);
        else if (yourFormat.name().equals(DifFormates.DateFormat.valueOf("USA").name()))
            return (changeTypeOfString(yourDate.month) + "-" + changeTypeOfString(yourDate.day) + "-" + yourDate.year);
        else if (yourFormat.name().equals(DifFormates.DateFormat.valueOf("ENG").name()))
            return (changeTypeOfString(yourDate.day) + "-" + changeTypeOfString(yourDate.month) + "-" + yourDate.year);
        else if (yourFormat.name().equals(DifFormates.DateFormat.valueOf("UK").name()))
            return (changeTypeOfString(yourDate.day) + "/" + changeTypeOfString(yourDate.month) + "/" + yourDate.year);
        else if (yourFormat.name().equals(DifFormates.DateFormat.valueOf("CUSTOM").name()))
            return (changeTypeOfString(yourDate.day) + " " + selectCurrentMonth(yourDate.month) + " " + yourDate.year + "г");
        return "";
    }

    public String selectCurrentMonth(int a) {
        return MonthsEnum.AllMonths.getNameByOrd(a);
    }



}


