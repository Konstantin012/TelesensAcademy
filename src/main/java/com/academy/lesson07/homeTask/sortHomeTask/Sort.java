//4) Заданную строку
//        - разбить на слова
//        - отсортировать слова по алфавиту не учитывая регистр первой буквы
//        - отсортировать слова по длине
//        - отсортировать слова по последней букве


package com.academy.lesson07.homeTask.sortHomeTask;

import com.academy.lesson07.homeTask.sortHomeTask.comparator.ComprByLastLetter;
import com.academy.lesson07.homeTask.sortHomeTask.comparator.ComprByLenght;
import com.academy.lesson07.homeTask.sortHomeTask.comparator.ComprToIgnoreCase;

import java.util.Arrays;


public class Sort {

    public static void main(String[] args) {
        String mainString = "Hello Wolrld! How are you? I am fine. Thanks. And you?";

        //        - разбить на слова
        String[] splitedString = mainString.split(" ");
        for (int i = 0; i < splitedString.length; i++) {
            splitedString[i] = splitedString[i].replaceAll("\\W", "").trim();
        }
        System.out.println(Arrays.toString(splitedString));
        Arrays.sort(splitedString);
        System.out.println(Arrays.toString(splitedString));

        //        - отсортировать слова по алфавиту не учитывая регистр первой буквы
        Arrays.sort(splitedString, new ComprToIgnoreCase());
        System.out.println(Arrays.toString(splitedString));

        //        - отсортировать слова по длине
        Arrays.sort(splitedString, new ComprByLenght());
        System.out.println(Arrays.toString(splitedString));

        //        - отсортировать слова по последней букве
        Arrays.sort(splitedString, new ComprByLastLetter());
        System.out.println(Arrays.toString(splitedString));
    }
}
