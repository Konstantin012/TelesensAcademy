package com.academy.lesson06.enamTask;

public class DifFormates {

    public enum DateFormat{
        RU ("Россия", "DD.MM.YYYY"),
        USA ("США","MM-DD-YYYY"),
        ENG ("Междунаролный английский","DD-MM-YYYY"),
        UK ("Великобритания","DD/MM/YYYY"),
        CUSTOM ("Пользовательский","DD <Название месяца> YYYYг");

        private String name;
        private String format;

        DateFormat(String name, String format){
            this.name = name;
            this.format = format;

        }
        public String getName(){
            return name;
        }

        public String getFormat() {
            return format;
        }
    }

}
