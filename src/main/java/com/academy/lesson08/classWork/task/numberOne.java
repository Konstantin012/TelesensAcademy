package com.academy.lesson08.classWork.task;

import java.util.Arrays;

public class numberOne {

    public static void main(String[] args) {
        Object[] currentArray = new Object[10];
        currentArray[0] = "Kolya";
        currentArray[1] = 45;
        currentArray[2] = 56;
        currentArray[3] = "Ivan";
        currentArray[4] = "Helen";
        currentArray[5] = 34;
        currentArray[6] = 18;
        currentArray[7] = "Peter";
        currentArray[8] = "Boris";
        currentArray[9] = 15;

        System.out.println(Arrays.toString(currentArray));
        System.out.println("String--------");
        for (Object ob:currentArray) {
            if(ob instanceof String){
                System.out.println(ob.toString());
            }
        }
        System.out.println("Integer--------");
        for (Object obj:currentArray) {
            if (obj instanceof Integer) {
                System.out.println(obj.toString());
            }
        }
    }


}
