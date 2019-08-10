package com.academy.lesson08.classWork.task;

import java.util.Arrays;

public class NumberTwo {
    public static void main(String[] args) {
        String onlyStr = "Constructor";

        System.out.println("-------Before Sort-------");
        char[] charArr = onlyStr.toCharArray();
        System.out.println(Arrays.toString(charArr));
        System.out.println("-------After Sort-------");
        Arrays.sort(charArr);
        System.out.println(Arrays.toString(charArr));
        String st = "";
        for (char ch:charArr) {
            st += ch;
        }
        System.out.println("-------New String-------");
        System.out.println(st);
    }
}
