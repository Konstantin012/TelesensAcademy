package com.academy.lesson08.classWork.task;

import java.util.Arrays;
import java.util.Comparator;

public class NumberFour {

    public static void main(String[] args) {
        Person[] arrayOfPerson = new Person[7];
        arrayOfPerson[0] = new Person("Ivan", 34);
        arrayOfPerson[1] = new Person("Kolya", 56);
        arrayOfPerson[2] = new Person("Boris", 18);
        arrayOfPerson[3] = new Person("Kolya", 18);
        arrayOfPerson[4] = new Person("Peter", 15);
        arrayOfPerson[5] = new Person("Helen", 45);
        arrayOfPerson[6] = new Person("Kolya", 32);

        System.out.println("-----Весь массив (через класс)-----");
        System.out.println(Arrays.toString(arrayOfPerson));
        System.out.println("-----1й способ. Только имена-----");
        for (int i = 0; i < arrayOfPerson.length; i++) {
            System.out.println(arrayOfPerson[i].getName());
        }
        System.out.println("-----1й способ. Только возраст-----");
        for (int i = 0; i < arrayOfPerson.length; i++) {
            System.out.println(arrayOfPerson[i].getAge());
        }

        Object[][] secondArray = new Object[][]
                {
                        {"Ivan", 34},
                        {"Kolya",56},
                        {"Boris",18},
                        {"Kolya",18},
                        {"Peter",15},
                        {"Helen",45},
                        {"Kolya",32},
                };

        System.out.println("-----Весь массив (через массив)-----");
        System.out.println(Arrays.toString(secondArray));
        System.out.println("-----2й способ. Только имена-----");
        //we don't know in which part we have a string
        for (int i = 0; i < secondArray.length; i++) {
            for (int j=0; j<2;j++){
                if(secondArray[i][j] instanceof String)
                    System.out.println(secondArray[i][j].toString());
            }
        }
        System.out.println("-----2й способ. Только возраст-----");
        for (int i = 0; i < secondArray.length; i++) {
            for (int j=0; j<2;j++){
                if(secondArray[i][j] instanceof Integer)
                    System.out.println(secondArray[i][j].toString());
            }
        }

//        // => отсортировать массив Person[] по именам (если совпадают - по возрасту)
//        Arrays.sort(arrayOfPerson,new ComparatorForNumberFour());

        // => отсортировать массив Person[] по именам (если совпадают - по возрасту Через Лямбду)
        Arrays.sort(arrayOfPerson, NumberFour::compareTest);


        // => вывести массив Person[]
        System.out.println("-----Отсортированный массив-----");
        System.out.println(Arrays.toString(arrayOfPerson));


    }

    public static int compareTest(Person p1, Person p2) {

        if (p1.getName().equals(p2.getName())) {
            return Integer.compare(p1.getAge(), p2.getAge());
        } else {
            return p1.getName().compareTo(p2.getName());
        }
    }


}
