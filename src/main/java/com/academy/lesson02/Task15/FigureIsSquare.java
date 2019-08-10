package com.academy.lesson02.Task15;

public class FigureIsSquare {
    public static void main(String[] args) {
        String st = "*";
        String space = " ";
        int spaceSize = 2;
        int size =4;

//        for (int i = 0; i < size; i++) {
//            if (i == 0 | i==size-1) {
//                System.out.println(String.join("", Collections.nCopies(size,st)));
//            }
//            else {
//                System.out.println(st+String.join("", Collections.nCopies(spaceSize,space))+st);
//            }
//        }
        System.out.println("--------Without Collection---------");
        for (int i = 0; i < size; i++) {
            if (i == 0 | i==size-1) {
            for(int j=0;j<4;j++){
                System.out.print(st);
                 }
            System.out.println();
            }
            else {
                System.out.println(st+space+space+st);
            }
        }

    }
}
