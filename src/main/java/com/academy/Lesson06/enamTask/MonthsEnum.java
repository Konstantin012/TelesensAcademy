package com.academy.Lesson06.enamTask;

public class MonthsEnum {

    public enum AllMonths {
        JAN("января"),
        FEB("Февраля"),
        MAR("марта"),
        APR("апреля"),
        MAY("мая"),
        JUN("июня"),
        JUL("июля"),
        AUG("августа"),
        SEP("сентября"),
        OCT("октября"),
        NOV("ноября"),
        DEC("декабря");

        private String name;

        AllMonths(String name) {
            this.name = name;
        }
        private int value;

        public int getOrdinal() {
            return value = ordinal();
        }
        public String getName() {
            return name;
        }

        public static String getNameByOrd(int ord) {
            AllMonths db = AllMonths.values()[ord-1];
            String a = db.getName();
            return a;
        }

    }
}
