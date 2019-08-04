package com.academy.Lesson05.task01;


import com.academy.Lesson06.enamTask.DifFormates;

public class DateTestMain {
    public static void main(String[] args) {
        Date d = new Date(28,12,1970);
        System.out.println(d.printTest(d, DifFormates.DateFormat.CUSTOM));

        d.print(DifFormates.DateFormat.RU);
        DateTime dd = new DateTime(30,12,2018,23,59,45);
//        dd.setHours(25);
//        dd.nextHour();
//        dd.nextMinute();
        dd.printTime();
        dd.printDateTime();
        dd.printTime(true);
    }

}
