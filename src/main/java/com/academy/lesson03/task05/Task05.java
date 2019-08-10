package com.academy.lesson03.task05;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scan = new Scanner(System.in);
        String randomS = scan.nextLine();
        System.out.println("Исходная строка: " + randomS);
        StringBuilder sb = new StringBuilder(randomS).reverse();
        String endToStart = sb.toString();
        System.out.println("Перевернутая строка: " + endToStart);
    }
}
