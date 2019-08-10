package com.academy.lesson02.task02;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        double index =2;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double number = scn.nextDouble();
        System.out.println(Math.pow(number,index));

    }
}
