package com.academy.concurrency;


public class TwoThreads {
    //Класс с методом main().
        public static void main(String[] args)
        {
            //Создание потока используя безымянный внутренний класс
            Thread myThready = new Thread(new Runnable()
            {
                public void run() //Этот метод будет выполняться в побочном потоке
                {
                    System.out.println("Привет из побочного потока!");
                }
            });
            myThready.start();	//Запуск потока

            System.out.println("Главный поток завершён...");
        }
    }
