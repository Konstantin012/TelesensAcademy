package com.academy.lesson04.task01;

public class TestSomeNumber {
    public static void main(String[] args) {
        SomeNumber someNumber = new SomeNumber(-10);
        System.out.println(someNumber.getN());
        someNumber.setN(15);
        someNumber.print();
        boolean bool = someNumber.isPositive();
        assert bool ==true;
        someNumber.setN(-1);
        bool = someNumber.isPositive();
        assert bool ==true;
    }
}
