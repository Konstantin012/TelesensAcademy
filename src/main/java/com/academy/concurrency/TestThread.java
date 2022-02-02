package com.academy.concurrency;

public class TestThread implements Runnable {
    //Нечто, реализующее интерфейс Runnable
    //(содержащее метод run())
    @Override
    public void run()        //Этот метод будет выполняться в побочном потоке
    {
        System.out.println("Привет из побочного потока!");
    }

}


