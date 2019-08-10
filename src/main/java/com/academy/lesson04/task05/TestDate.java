package com.academy.lesson04.task05;

import java.util.Scanner;

public class TestDate {
    public static void main(String[] args) {
        System.out.println("Первая дата");
        DateMain firstDate = enterDates();
        System.out.println("Вторая дата");
        DateMain secondDate = enterDates();
        DateMain.getDifference(firstDate.getDate(),secondDate.getDate());



    }

    public static DateMain enterDates()
    {
        Scanner sc = new Scanner(System.in);
        DateMain dat = new DateMain();
        System.out.print("Введите день: ");
        dat.setDay(Integer.parseInt(sc.nextLine()));
        System.out.print("Введите месяц: ");
        dat.setMonth(Integer.parseInt(sc.nextLine()));
        System.out.print("Введите год: ");
        dat.setYear(Integer.parseInt(sc.nextLine()));
        return dat;
    }
}
