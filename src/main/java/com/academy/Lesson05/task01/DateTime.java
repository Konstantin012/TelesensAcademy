package com.academy.Lesson05.task01;

import java.util.Objects;

public class DateTime extends Date {
    private int hours;
    private int minutes;
    private int seconds;

    public DateTime(int hours, int minutes, int seconds) {
        checkForCheckTime(hours, minutes, seconds);
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public DateTime(int day, int month, int year, int hours, int minutes, int seconds) {
        super(day, month, year);
        checkForCheckTime(hours, minutes, seconds);
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public DateTime(Date date, int hours, int minutes, int seconds) {
        super(date);
        checkForCheckTime(hours, minutes, seconds);
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        checkForCheckTime(hours, minutes, seconds);
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        checkForCheckTime(hours, minutes, seconds);
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        checkForCheckTime(hours, minutes, seconds);
        this.seconds = seconds;
    }

    public boolean checkTime(int hours, int minutes, int seconds) {
        if (hours >= 0 & hours <= 24 & minutes >= 0 & minutes <= 60 & seconds >= 0 & seconds <= 60) {
            return true;
        } else {
            return false;
        }
    }

    public void checkForCheckTime(int hours, int minutes, int seconds) {
        try {
            assert checkTime(hours, minutes, seconds);
        } catch (AssertionError e) {
            System.out.println("Incorrect Value!!!");
        }
    }

    //увеличивают на единицу значение часа
    public DateTime nextHour() {
        if (this.hours + 1 > Time.HOURS.getCounter()) {
            addSeconds((this.hours + 1 - Time.HOURS.getCounter()) * 3600);
        } else {
            setHours(++hours);
        }
        return this;
    }

    //увеличивают на единицу значение минут
    public DateTime nextMinute() {
        if (this.minutes + 1 > Time.MINUTES.getCounter()) {
            addSeconds((this.minutes + 1 - Time.MINUTES.getCounter()) * 60);
        } else {
            setMinutes(++minutes);
        }
        return this;
    }

    //увеличивают на единицу значение секунд
    public DateTime nextSecond() {
        if (this.seconds + 1 > Time.SECONDS.getCounter()) {
            addSeconds((this.seconds + 1 - Time.SECONDS.getCounter()) * 60);
        } else {
            setMinutes(++seconds);
        }
        return this;
    }

    //который добавляет указанное кол-во секунд к текущей дате
    public void addSeconds(int seconds) {
        int currentSec = Time.SECONDS.getCounter();
        int currentMin = Time.MINUTES.getCounter();
        int currentHour = Time.HOURS.getCounter();
        this.seconds += seconds;
        if (this.seconds > currentSec) {
            //метод для получения граничного значения переменной 60 или 24 но не больше
            getMaxValue(this.seconds, currentSec);
            //устанавливаем новое значение секунд
            setSeconds(tempCur);
            //добавляем лишние минуты
            this.minutes += tempNext;
            if (this.minutes > currentMin) {
                getMaxValue(this.minutes, currentMin);
                setMinutes(tempCur);
                this.hours += tempNext;
                if (this.hours > currentHour) {
                    getMaxValue(this.hours, currentHour);
                    setHours(tempCur);
                    addDays(tempNext);
                }
            }

        }
    }

    private int tempCur = 0;
    private int tempNext = 0;

    public void getMaxValue(int actualTime, int expectedTime) {
        if (actualTime > expectedTime) {
            tempNext = actualTime / expectedTime;
            tempCur = actualTime - (expectedTime * tempNext);
        } else {
            tempCur = actualTime;
            tempNext = 0;
        }

    }


    public enum Time {
        SECONDS(60),
        MINUTES(60),
        HOURS(24);

        private int counter;

        Time(int counter) {
            this.counter = counter;
        }

        int getCounter() {
            return counter;
        }
    }


    @Override
    public String toString() {
        return changeTypeOfString(hours) +
                ":" + changeTypeOfString(minutes) +
                ":" + changeTypeOfString(seconds);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DateTime dateTime = (DateTime) o;
        return hours == dateTime.hours &&
                minutes == dateTime.minutes &&
                seconds == dateTime.seconds &&
                tempCur == dateTime.tempCur &&
                tempNext == dateTime.tempNext;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hours, minutes, seconds, tempCur, tempNext);
    }

    public void printTime() {
        System.out.println(this.toString());
    }

    public void printTime(boolean format) {
        if (format) {
            if (hours >= 12 & hours < 24)
                System.out.println(changeTypeOfString(hours - 12) + ":" + changeTypeOfString(seconds) + " p.m");
            else if (hours >= 0 & hours < 12)
                System.out.println(changeTypeOfString(hours - 12) + ":" + changeTypeOfString(seconds) + " a.m");
        } else {
            System.out.println(changeTypeOfString(hours) + ":" + changeTypeOfString(seconds));
        }
    }

    public void printDateTime() {
        System.out.println(super.toString() + "   "+ this.toString());
    }
}
