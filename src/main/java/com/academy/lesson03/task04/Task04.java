package com.academy.lesson03.task04;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        System.out.println("Введите строку и цифры: ");
        Scanner scan = new Scanner(System.in);
        String randomS = scan.nextLine();
        System.out.println("Исходная строка: " + randomS);
        int firstLenght = randomS.length();
        String numbers = randomS.replaceAll("\\D","");
        randomS = randomS.replaceAll("\\d","");
        System.out.println("Cтрока без цыфр: " + randomS);
        System.out.println("Удалено цыфр: " + (firstLenght-randomS.length()));
        System.out.println("Удаленые цыфры: " + numbers);


    }
}
