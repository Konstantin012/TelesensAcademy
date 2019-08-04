package com.academy.Lesson01.Task09;

	public class NinthTask{
	public static void main(String[] args){
		if (args.length == 2){
			System.out.println(args[0]+" Peter Привет! "+args[1]);
			System.out.println(args[0]+" Peter Это моя первая программа. Я пишу на Java. "+args[1]);
			System.out.println(args[0]+" Программировать - это интересно. "+args[1]);
			System.out.println(args[0]+" Моя цель - осовить Java "+args[1]);
		}
		if (args.length == 1){
			System.out.println(args[0]+" Peter Привет!");
			System.out.println(args[0]+" Peter Это моя первая программа. Я пишу на Java.");
			System.out.println(args[0]+" Программировать - это интересно.");
			System.out.println(args[0]+" Моя цель - осовить Java");
		}
		if (args.length == 0){
			System.out.println("Peter Привет!");
			System.out.println("Peter Это моя первая программа. Я пишу на Java.");
			System.out.println("Программировать - это интересно.");
			System.out.println("Моя цель - осовить Java");
		}

	}



}