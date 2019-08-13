package com.academy.lesson07.сlassTask.sort.model;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private long id;
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public Person(long id, int age, String name) {
        this(age, name);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
                "id=" + id +
                ", age=" + age +
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

}
