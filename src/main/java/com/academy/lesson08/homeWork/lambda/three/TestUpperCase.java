package com.academy.lesson08.homeWork.lambda.three;

import java.util.Scanner;

//3)  Создайте лямбда-выражение, которое переводит строку в верхний режим.
//        Перевести строку в верхний регистр с помощью лямбда-выражения.
//        Перевести строку в верхний регистр с помощью ссылки на метод.

public class TestUpperCase {
    public static void main(String[] args) {
        ToUpperCaseAPI upper = s -> s.toUpperCase();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your the first string");
        String nextSt = scanner.nextLine();
        System.out.println(upper.changeRegistr(nextSt));

        ToUpperCaseAPI upper2 = String::toUpperCase;
        System.out.println("Enter your the second string");
        String nextSt2 = scanner.nextLine();
        System.out.println(upper.changeRegistr(nextSt2));
    }
}
