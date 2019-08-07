package com.academy.lesson07.сlassTask.sort.comparator;


import com.academy.lesson07.сlassTask.sort.model.Person;

import java.util.Comparator;

public class PersonByNameThenByAgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        String name1 = p1.getName();
        String name2 = p2.getName();;

        Integer age1 = p1.getAge();
        Integer age2 = p2.getAge();

        if (name1.equals(name2)) {
            // по возрасту
//            return Integer.compare(age1, age2);
            return age1.compareTo(age2);
        } else {
            return name1.compareTo(name2);
        }
    }
}
