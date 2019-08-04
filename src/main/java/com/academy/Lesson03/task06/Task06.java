package com.academy.Lesson03.task06;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task06 {
    public static void main(String[] args) {
        int cyrillicCount =0;
        int latinCount =0;
        System.out.println("Введите строку: ");
        Scanner scan = new Scanner(System.in);
        String randomS = scan.nextLine();
        System.out.println("Исходная строка: " + randomS);
        Pattern cyrillic = Pattern.compile(
                "[" +                   //начало списка допустимых символов
                        "а-яА-ЯёЁ" +    //буквы русского алфавита
                        "\\d" +         //цифры
                        "\\s" +         //знаки-разделители (пробел, табуляция и т.д.)
                        "\\p{Punct}" +  //знаки пунктуации
                        "]" +                   //конец списка допустимых символов
                        "*");
        Pattern latin = Pattern.compile(
                "[" +                   //начало списка допустимых символов
                        "A-Za-zÀ-ÿ" +    //буквы русского алфавита
                        "\\d" +         //цифры
                        "\\s" +         //знаки-разделители (пробел, табуляция и т.д.)
                        "\\p{Punct}" +  //знаки пунктуации
                        "]" +                   //конец списка допустимых символов
                        "*");

        String[] temp3 = randomS.split("");
        for (String s: temp3) {
            Matcher matcherCyrillic = cyrillic.matcher(s);
            Matcher matcherLatin = latin.matcher(s);
            if (matcherCyrillic.matches()) cyrillicCount++;
            if (matcherLatin.matches()) latinCount++;
        }

        System.out.println("Количество символов кириллицы: " + cyrillicCount);
        System.out.println("Количество символов латинницы: "+ latinCount);
    }
}
