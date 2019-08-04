package com.academy.Lesson04.task03a;

public class TestCurrency {
    public static void main(String[] args) {
        Currency cur = new Currency(125.698, "грн");
        cur.print();
        cur.add(174.856,"грн");
        cur.print();
        cur.substract(14.86,"руб");
        cur.print();
        cur.substract(100,"грн");
        cur.print();
        cur.add(cur);
        cur.print();


    }

}
