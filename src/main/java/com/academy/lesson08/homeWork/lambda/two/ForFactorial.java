package com.academy.lesson08.homeWork.lambda.two;

import java.util.Scanner;


//2)	Создайте блочное лямбда-выражение для вычисления факториала целого числа.
//        Продемонстрируйте его использование.


public class ForFactorial {
    public static void main(String[] args) {
        FactorAPI factor = (a) ->{
            int result = 1;
            for(int i =1; i<=a;i++){
                result = i*result;
            }
            return result;
        };
        Scanner scanner = new Scanner(System.in);
        int enterNumb = scanner.nextInt();
        System.out.println("Факториал числа " + enterNumb + " = " + factor.operation(enterNumb));
    }
}
