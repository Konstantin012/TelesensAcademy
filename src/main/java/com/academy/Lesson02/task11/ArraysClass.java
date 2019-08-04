package com.academy.Lesson02.task11;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args){
        int[] array = new int[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100-20);
        }
        System.out.println(Arrays.toString(array));
        int j=0;
        while (j!=array.length)
        {
            array[j] = (int)(Math.random()*100-10);
            j++;
        }
        System.out.println(Arrays.toString(array));


    }
}
