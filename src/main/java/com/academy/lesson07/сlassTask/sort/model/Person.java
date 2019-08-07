package com.academy.lesson07.сlassTask.sort.model;

public class Person implements Comparable<Person> {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    // Для сортировки

    @Override
    public int compareTo(Person other) {
        String name1 = this.name;
        String name2 = other.name;
//        System.out.println("***");
//        System.out.println("DEBUG->name1 " + name1);
//        System.out.println("DEBUG->name2 " + name2);

//        if (name1.equals(name2))
//            return 0;

//        if (name1.compareTo(name2) == 0)
//            return 0;
//
//        if (name1.compareTo(name2) == -1)
//            return -1;
//        else
//            return 1;

        return name1.compareTo(name2);
    }
}
