package com.academy.lesson09.Collection;

import java.util.*;

//1) Дан массив имен: {"Peter", "Helen", "Andry", "Abdel", "Kate", "Veronica", "Leonid", "Alex", "max}
//        a) Создать список List из элементов массива и вывести на экран
//        b) Добавить 3 новых имени в список (Philip, Joseph, Leon) и вывести весь список на экран
//        c) Удалить из списка все имена: Veronica, Leonid и вывести на экран
//        d) Поменять имя Helen на Elizabet
//        e) Отсортировать имена по алфавиту и вывести на экран
//        f) Отсортировать имена в обратном порядке и вывести имена на экран
//        g) Перевести все первые символы в верхний регистр
//        h) Вывести все имена, начинающиеся на букву A
//        i) Проверить, содержит ли список имя Andry
//        j) Удалить из списка все имена кроме Kate и Helen
public class Task1 {
    public static void main(String[] args) {
        String[] nameArray = new String[]{"Peter", "Helen", "Andry", "Abdel", "Kate", "Veronica", "Leonid", "Alex", "max"};
        List<String> nameList = new ArrayList<String>(Arrays.asList(nameArray));
        System.out.println("a) Создать список List из элементов массива и вывести на экран");
        System.out.println(nameList);
        nameList.add("Philip");
        nameList.add("Joseph");
        nameList.add("Leon");
        System.out.println("b) Добавить 3 новых имени в список (Philip, Joseph, Leon) и вывести весь список на экран");
        System.out.println(nameList);
        nameList.remove("Veronica");
        nameList.remove("Leonid");
        System.out.println("c) Удалить из списка все имена: Veronica, Leonid и вывести на экран");
        System.out.println(nameList);
        for (String s:nameList) {
            if (s == "Helen"){
                int a = nameList.indexOf(s);
                nameList.set(a,"Elizabet");
            }
        }
        System.out.println("d) Поменять имя Helen на Elizabet");
        System.out.println(nameList);
        nameList.sort(String::compareTo);
        System.out.println("e) Отсортировать имена по алфавиту и вывести на экран");
        System.out.println(nameList);
        Collections.sort(nameList, Collections.reverseOrder());
        System.out.println("f) Отсортировать имена в обратном порядке и вывести имена на экран");
        System.out.println(nameList);
        int count = 0;
        for (String s: nameList) {
            String f = Character.toString(s.charAt(0));
            String l = s.substring(1);
            String chagned = f.toUpperCase()+l.toLowerCase();
            nameList.set(count,chagned);
            count++;
        }
        System.out.println("g) Перевести все первые символы в верхний регистр");
        System.out.println(nameList);

        System.out.println("h) Вывести все имена, начинающиеся на букву A");
        for (String s:nameList) {
            if(s.charAt(0)=='A' || s.charAt(0)=='a'){
                System.out.println(s);
            }
        }
        System.out.println("i) Проверить, содержит ли список имя Andry");
        for (String s:nameList) {
            if(s.contains("Andry"))
                System.out.println(true);
        }
        System.out.println("j) Удалить из списка все имена кроме Kate и Helen");
        String[] testArray = new String[]{"Kate" ,"Helen"};
        List<String> testList = new ArrayList<>(Arrays.asList(testArray));
        nameList.retainAll(testList);
        nameList.add("Helen");
        System.out.println(nameList);


    }
}
