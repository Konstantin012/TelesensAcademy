package com.academy.lesson01.Task09;

public class NinthTaskShort {
    public static void main(String[] args){
        String pre="";
        String post="";
        if (args.length == 2){
            pre= args[0];
            post = args[1];
        }
        else if (args.length == 1){
            pre= args[0];
        }
        System.out.println(pre+" Peter Привет! "+post);
        System.out.println(pre+" Peter Это моя первая программа. Я пишу на Java. "+post);
        System.out.println(pre+" Программировать - это интересно. "+post);
        System.out.println(pre+" Моя цель - осовить Java "+post);
    }
}
