package com.academy.lesson07.сlassTask.sort;

import com.academy.lesson07.сlassTask.sort.comparator.PersonByAgeComparator;
import com.academy.lesson07.сlassTask.sort.comparator.PersonByNameThenByAgeComparator;
import com.academy.lesson07.сlassTask.sort.comparator.StringBy3LetterComparator;
import com.academy.lesson07.сlassTask.sort.model.Person;


import java.util.Arrays;

public class SortDemo {
    public static void main(String[] args) {
        String[] array = {
                "Hello",
                "Bye",
                "Zero",
                "Main",
                "SortDemo",
                "lesson07"};

        System.out.println(Arrays.toString(array));
        // Сортируем, используя естественный порядок для String
        // 'Естественный' определяется уже реализованным методом
        // у класс String:
        // int compareTo(String anotherString) {...}
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        // Сортируем, используя нужный нам порядок.
        // 'Способ упорядочивания' мы объясняем через
        // реализацию интерфейса 'comparator'
        Arrays.sort(array, new StringBy3LetterComparator());
        System.out.println(Arrays.toString(array));

        Person[] persons = {
                new Person(25, "Helen"),
                new Person(32, "Kolya"),
                new Person(27, "Kolya"),
                new Person(23, "Kolya"),
                new Person(27, "Kolya"),
                new Person(15, "Peter"),
                new Person(18, "Sasha"),
                new Person(74, "Boris"),
                new Person(27, "Kolya"),
                new Person(56, "Ivan"),
        };

        System.out.println(Arrays.toString(persons));

        System.out.println("---------Sorted persons-----");
        Arrays.sort(persons, new PersonByAgeComparator());
        System.out.println(Arrays.toString(persons));

        System.out.println("---------Sorted persons-----");
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));

        System.out.println("---------Sort by name then by age persons-----");
        Arrays.sort(persons, new PersonByNameThenByAgeComparator());
        System.out.println(Arrays.toString(persons));
    }
}
