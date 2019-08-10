package com.academy.lesson02.Task16;

import java.util.ArrayList;
import java.util.Collections;


public class Palindrom {
    public static ArrayList<Integer> listOfPalindoms;

    public static void main(String[] args) {
        listOfPalindoms = new ArrayList<>();
        int a=100;
        int b=100;
        setPalindomsList1(a,b);
        System.out.println(Collections.max(listOfPalindoms));





    }

    public static void setPalindomsList1(int one, int two)
    {
        for (int k=0;k<899;k++){
            for (int i =0;i<999;i++){
                int sum = (Integer)(one*two);
                //Проверяем палиндром ли это?
//                boolean bool = checkMeth(sum);
                boolean bool = checkMethNew(sum);
                if (bool){
                    listOfPalindoms.add(sum);
                }
                two++;
            }
            one ++;
        }

    }


    public static boolean checkMeth(int sum)
    {
        boolean palindCheck = false;
        String one = Integer.toString(sum);
        String[] s = one.split("");
        int len = s.length;
        int halfLen = len/2;
        for (int i=0; i<halfLen;i++){
            String a = s[i];
            String b = s[len-1-i];
            if(a.equals(b)) {
                palindCheck = true;
            }

            else break;
        }
        return palindCheck;
    }


    public static boolean checkMethNew(int sum)
    {
        boolean palindCheck = false;
        String one = Integer.toString(sum);
        String rew = new StringBuilder(one).reverse().toString();
        int o = Integer.valueOf(one);
        int oo = Integer.valueOf(rew);
        for (int i = 0; i < one.length(); i++) {
            if(o == oo) {
                palindCheck = true;
            }
            else break;
        }
        return palindCheck;
    }

//проверочный
    public static boolean checkMeth2()
    {
        boolean palindCheck = false;
        String one = Integer.toString(151601);
        String[] s = one.split("");
        int len = s.length;
        int halfLen = len/2;
        for (int i=0; i<halfLen;i++){
            String a = s[i];
            String b = s[len-1-i];
            if(a.equals(b))
                palindCheck = true;

            else break;
        }
        return palindCheck;
    }

}
