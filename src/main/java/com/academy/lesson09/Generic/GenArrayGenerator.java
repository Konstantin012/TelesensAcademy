package com.academy.lesson09.Generic;



public class GenArrayGenerator {

    public static void main(String[] args) {
        TestingMethod();

        GenArray<Long> genArray = new GenArray<>(new Long[20]);
        for(int i=0;i<20;i++){
            genArray.set(i,generateNextNumber());
        }
        System.out.println(genArray.toString());

        try{
            long d = genArray.get(21);
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        long d = genArray.get(15);
        System.out.println(d);


        System.out.println("Отсортированный массив");
        System.out.println(genArray.sorting());


    }

    public static long generateNextNumber(){
        long b = 9990000000L + (long)(Math.random()*9999999L);
        if (b%10 ==0 || b%5 ==0) return b;
        else return generateNextNumber();
    }

    public static void TestingMethod () {
        String forMath = "999";
        String firstThree = String.valueOf(generateNextNumber()).substring(0,3);
        String test =String.valueOf(generateNextNumber());
        String lastOne = String.valueOf(test.charAt(test.length()-1));
        assert firstThree.matches(forMath);
        assert lastOne.matches("[0 5]");



    }

}
