package com.academy.concurrency;

public class Programm			//Класс с методом main()
{
    static TestThread mThing;	//mThing - объект класса, реализующего интерфейс Runnable

    public static void main(String[] args)
    {
        mThing = new TestThread();

        Thread myThready = new Thread(mThing);	//Создание потока "myThready"
        myThready.start();				//Запуск потока

        System.out.println("Главный поток завершён...");
    }
}
