package com.academy.Lesson04.task05;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain {

    private int day;
    private int month;
    private int year;
    private String date;


    public String getDate() {
        date= day + "." + month + "." + year;
        return date;
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
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
        checkData(day, month, year);
    }



    public static void checkData(int day, int month, int year) {
        if (day > 0 & day <= 31 && month > 0 & month <= 12 && year > 0 && year <= 2019) {
            String dateTemp = day + "." + month + "." + year;
            System.out.println("Введенная дата: " + dateTemp);
        } else {
            System.out.println("Incorrect date");
        }

    }

    public static void getDifference(String one, String two) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            Date date1 = dateFormat.parse(one);
            Date date2 = dateFormat.parse(two);
            long milliseconds = date2.getTime() - date1.getTime();
            int days = (int) (milliseconds / (24 * 60 * 60 * 1000));
            System.out.println("Разница между датами в днях: " + Math.abs(days));
        } catch (Exception e) {
            e.printStackTrace();
        }


//    final static String DATE_FORMAT = "dd.MM.yyyy";
//    public static boolean isDateValid(String date)
//    {
//        try {
//            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
//            df.setLenient(false);
//            df.parse(date);
//            return true;
//        } catch (ParseException e) {
//            return false;
//        }
//    }
    }
}
