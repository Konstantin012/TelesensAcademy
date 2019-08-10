package com.academy.lesson08.classWork.task;

import java.util.Arrays;

public class NumberThree {
    public static void main(String[] args) {
        String[] stArray = new String[4];
        stArray[0] = "track_23";
        stArray[1] = "track_12";
        stArray[2] = "track_06";
        stArray[3] = "track_22";

        Arrays.sort(stArray, new ComparatorForNumberThree());
        System.out.println(Arrays.toString(stArray));
    }
}
