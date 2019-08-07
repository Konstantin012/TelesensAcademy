package com.academy.lesson07.homeTask;

import java.util.Arrays;

public class CurrentString {
    public static void main(String[] args) {
    String[] array = {
            "Hello",
            "Bye",
            "Zero",
            "Main",
            "CurrentString",
            "lesson07"};
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
        Arrays.sort(array, new String3LetterComparator());
        System.out.println(Arrays.toString(array));
    }


}
