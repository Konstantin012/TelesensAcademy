package com.academy.lesson10.exercise;

import com.academy.lesson07.сlassTask.sort.model.Person;

import java.util.Comparator;

public class Compic implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        Integer ag1 =p1.getAge();
        Integer ag2 =p2.getAge();
        return ag1.compareTo(ag2);
    }
}
