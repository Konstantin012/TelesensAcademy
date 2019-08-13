package com.academy.lesson09;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        char[] array = {'H','e','l','l','o'};
        int[] gf = {1,2,4,7,8};

        String a =Arrays.toString(gf).replaceAll("\\[|\\]|,|\\s", "");;
        System.out.println(a);
    }

}
