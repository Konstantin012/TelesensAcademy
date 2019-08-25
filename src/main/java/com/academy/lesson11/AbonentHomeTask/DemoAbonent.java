package com.academy.lesson11.AbonentHomeTask;

import com.academy.lesson12.SubsciberHomeDB;

public class DemoAbonent {
    public static void main(String[] args) {

//        String path = args[0];  //передается путь с programm arguments
        Filler filler = new Filler();
        //Создаем Excel файл с данными
        filler.fillingExcel();

        FromExcelTo fromExcelTo = new FromExcelTo();

        //	d) Прочитать subscribers.xlsx в коллекцию Map<Long, Subscriber> и сохранить в текстовый файл: subscribers.txt  (создание класса Subscriber)
        //		(путь к файлу взять из 'java-part.properties')
        //Вывод в ЛОГ
        fromExcelTo.createMapFromExcel().writeToTxT();

        //	e) Прочитать subscribers.xlsx в коллекцию List<Subscriber> отсортировать сразу по 4 полям:
        //		- оператору
        //		- по возрасту
        //		- по фамилии
        //		- по имени
        //	f) Сохранить результат сортировки в файл 'sort-subscribers.txt'
        //		(путь к файлу взять из 'java-part.properties')
        fromExcelTo.sortedListAndWritingFromListToTxt();

//        g) Прочитать 1-ый десять строк файла sort-subscribers.txt и вывести на экран
//        (путь к файлу взять из 'java-part.properties')
//        fromExcelTo.ReadFromTxtAndSout();

    }


}
