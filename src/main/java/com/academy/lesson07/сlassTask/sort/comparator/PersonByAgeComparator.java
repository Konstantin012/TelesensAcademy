package com.academy.lesson07.сlassTask.sort.comparator;

import com.academy.lesson07.сlassTask.sort.model.Person;

import java.util.Comparator;

public class PersonByAgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        // Сначала извлекаем возраст
        int age1 = p1.getAge();
        int age2 = p2.getAge();

        // Логика определения порядка по возрасту
        if (age1 == age2)
            return 0;

        if (age1 < age2)
            return -1;
        else
            return 1;
    }
}
