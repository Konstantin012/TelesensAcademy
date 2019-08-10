package com.academy.lesson08.homeWork.lambda.one;

import java.util.Scanner;

public class TrueOrFalse {

//    1) 	Составьте лямбда-выражение, которое возвращает значение true, если
//    число принадлежит к диапазону чисел 10-20, включая граничные значения

    public static void main(String[] args) {
        RangeCheckAPI rangeCheck = new RangeCheckAPI() {
            @Override
            public boolean checking(int i) {
                if(i<=20 & i>=10) return true;
                else
                return false;
            }
        };
        boolean test = rangeCheck.checking(15);
        System.out.println(test);
        test = rangeCheck.checking(45);
        System.out.println(test);

        RangeCheckAPI rangeCheckAPI2 = i -> {
            if(i<=20 & i>=10) return true;
            else
                return false;
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int nextInt = scanner.nextInt();
        System.out.println(rangeCheck.checking(nextInt));
    }
}
