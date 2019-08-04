package com.academy.Lesson02.task7;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[2];
        Scanner scn = new Scanner(System.in);

        if (args.length==2){
            numbers[0] = Integer.parseInt(args[0]);
            numbers[1] = Integer.parseInt(args[1]);
        }
        else if(args.length ==1){
            numbers[0] = Integer.parseInt(args[0]);
            numbers[1] =  scn.nextInt();
        }
        else if (args.length==0){
             for (int i=0;i<numbers.length;i++){
                System.out.printf("Введите %dе число: ", i+1);
                int temp = scn.nextInt();
                numbers[i] = temp;
            }
        }


        int a = numbers[0];
        int b = numbers[1];

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%de число = ", (i+1));
            System.out.println(numbers[i]);

        }

        System.out.printf("%s / %s = ",a,b);
        System.out.println(a/b);
        System.out.printf("Остаток от деления = " + (a%b));


    }
}
