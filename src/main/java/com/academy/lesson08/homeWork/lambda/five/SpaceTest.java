package com.academy.lesson08.homeWork.lambda.five;

import java.util.Scanner;

public class SpaceTest {
    public static void main(String[] args) {
        NoSpaceAPI noSpace = s -> s.replaceAll("\\s","");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string");
        String nextSt = scanner.nextLine();
        System.out.println(noSpace.deletingSpace(nextSt));
    }
}
