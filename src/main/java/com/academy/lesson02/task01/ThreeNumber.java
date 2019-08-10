package com.academy.lesson02.task01;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThreeNumber {
    public static Scanner scan;
    public static int[] someArr;
    public static boolean fix;
    public static int size;


    public static void main(String[] args) {

        size = 3;
        someArr = new int[size];
        setArray();
        minAndMax();
        average();
        sort();


    }

        public static void setArray()
        {

            for (int i = 0; i < size; i++) {
                System.out.printf("Введите число %de число: ", (i+1));
                someArr[i] = check();
                while (fix){
                    System.out.printf("Введите число %de число: ", (i+1));
                    someArr[i] = check();
                }

            }
        }

        public static int check()
        {
            int b = 0;
            scan = new Scanner(System.in);
            try {
                b = scan.nextInt();
                fix = false;
            } catch (InputMismatchException ex) {
                System.out.print("Вы ввели не число, попробуйте еще раз! \n");
                fix = true;
            }
            return b;
        }

        public static void minAndMax()
        {
            int max =someArr[0];
            int min = someArr[0];
            int midl =0;

            for (int i = 1; i < someArr.length; i++) {
                if (min > someArr[i]){
                    min = someArr[i];
                }
                if (max < someArr[i]){
                    max = someArr[i];
                }
            }

            System.out.println("Минимальное значение в массиве = " + min);
            System.out.println("Максимальное значение в массиве = " + max);

        }

    public static void average()
    {
        int aver =0;
        for (int i = 0; i < someArr.length; i++) {
            aver += someArr[i];
        }
        double averageN = (double) aver/someArr.length;
        System.out.format("Среднее арифметическое = %.3f%n", averageN);


    }

        public static void sort()
        {
            System.out.println("-------Sort Method-------");
            Arrays.sort(someArr);
            System.out.println("Минимальное значение в массиве = " + someArr[0]);
            System.out.println("Среднее значение в массиве = " + someArr[(size-1)/2]);
            System.out.println("Максимальное значение в массиве = " + someArr[size-1]);
        }




    }




