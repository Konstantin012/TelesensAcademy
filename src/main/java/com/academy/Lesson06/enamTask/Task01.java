package com.academy.Lesson06.enamTask;

public class Task01 {

    public static void main(String[] args) {
        System.out.println(WeekDays.getDayAfterTomorrow(WeekDays.СУББОТА));
        System.out.println(WeekDays.getDayAfterTomorrow(WeekDays.ВОСКРЕСЕНЬЕ));
        System.out.println(WeekDays.getDayBeforeYesterday(WeekDays.ПОНЕДЕЛЬНИК));
        System.out.println(WeekDays.getDayBeforeYesterday(WeekDays.ВТОРНИК));
        System.out.println(WeekDays.ВТОРНИК.isWeekend());
    }

    public enum WeekDays {
        ПОНЕДЕЛЬНИК,
        ВТОРНИК,
        СРЕДА,
        ЧЕТВЕРГ,
        ПЯТНИЦА,
        СУББОТА,
        ВОСКРЕСЕНЬЕ;

        static WeekDays getDayAfterTomorrow(WeekDays days) {
            int a = days.ordinal();
            int f = WeekDays.values().length - 1;
            if (a == WeekDays.values().length - 2) {
                a = a - 5;
            } else if (a == WeekDays.values().length - 1) {
                a = a - 5;
            } else a = a + 2;
            WeekDays da = WeekDays.values()[a];
            return da;
        }

        static WeekDays getDayBeforeYesterday(WeekDays days) {
            int a = days.ordinal();
            if (a == 0) {
                a = a + 5;
            } else if (a == 1) {
                a = a + 5;
            } else a = a - 2;
            WeekDays db = WeekDays.values()[a];
            return db;
        }

        boolean isWeekend() {
            switch (this) {
                case СУББОТА:
                case ВОСКРЕСЕНЬЕ:
                    return true;
                default:
                    return false;

            }
        }
    }
}
