package com.academy.lesson01.PresentationTask;

import java.util.Scanner;

public class PresentationExercise {
    public static void main(String[] args)
    {
        String name = "";
        String lastName = "";
        String patronymic = "";
        Integer age;
        String gender = "";
        Integer number;
        Scanner scan = new Scanner(System.in);
        System.out.print("> Введите Имя: ");
        name = scan.nextLine();
        System.out.print("> Введите Фамилию: ");
        lastName = scan.nextLine();
        System.out.print("> Введите Отчество: ");
        patronymic = scan.nextLine();
        System.out.print("> Введите Возраст: ");
        age = scan.nextInt();
        System.out.print("> Введите Пол (м/ж): ");
        gender = scan.next();
        System.out.print("> Введите Номер (10 цифр): ");
        number = scan.nextInt();
        System.out.println();
        System.out.println("--------Абонент--------");
        System.out.println("Имя: " + name + "\n" +  "Фамилия: " + lastName + "\n" + "Отчество: " + patronymic + "\n" + "Возраст: " + age + "\n" + "Пол: " + gender+ "\n" + "Номер: " + number);

    }



}
