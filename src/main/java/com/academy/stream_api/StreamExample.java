package com.academy.stream_api;

import org.apache.logging.log4j.core.util.JsonUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) throws NoSuchFieldException {
        // начнем с объявления массива
        Integer[] array = new Integer[]{1,2,3,4};
        Integer[] array2 = {1,2,3,4};

        ArrayList<Integer> collection = new ArrayList<Integer>(Arrays.asList(array));
        collection.add(7);

        // odd - нечетный
        // even -четный
        Integer sumOddNumbers = 0;
        for (int i: collection) {
            if (i%2!=0)
                sumOddNumbers+=i;}
            System.out.println("sum = " + sumOddNumbers);

        IntStream.of(50, 60, 70, 80, 90, 100, 110, 120).filter(x -> x < 90).map(x -> x + 10)
                .limit(3).forEach(System.out::println);

        Integer sumOdd = collection.stream().filter(o -> o % 2 != 0).reduce((s1, s2) -> s1 + s2).orElse(0);
        System.out.println("sum of odd numbers" + sumOdd);

        Integer sumOdd2 = collection.parallelStream().filter(o -> o % 2 != 0).reduce((s1, s2) -> s1 + s2).orElse(0);

        for (Integer i:array){
            System.out.println(i+" ");
        }

        Integer[] array3 = new Integer[] {0,1,3,4};
        Integer[] array5 = {1,2,3,4};

        List<Integer> list =new ArrayList<>(Arrays.asList(array3));
        list.stream().forEach(System.out::println);

        list.stream().filter(x-> x.toString().length() == 3).forEach(System.out::println);
        list.stream().forEach(x -> System.out.println(x));

        /**
         * --- 1 ----- Stream creation from collection ---------
         **/
        Collection<String> collection2 = Arrays.asList("a1", "a2", "a3");
        Stream<String> streamFromCollection = collection2.stream();


        /**
         * ----2 ----- Stream creation from Values
         */
        Stream<String> streamFromValues = Stream.of("a1", "a2", "a3");

        /**
         * ---3----- Stream creation from Array
         */

        String[] array1 = {"a1","a2","a3"};
        Stream<String> streamFromArrays = Arrays.stream(array1);
        streamFromArrays.forEach(System.out::println);

        /** -
         * ---4 ------ Stream creation from file: each line - new element
         */

//        try {
//        Stream<String> streamFromFiles = Files.lines(Paths.get("file.txt"));}
//        catch (Exception ex) {
//            ex.printStackTrace();
//            System.out.println("Error: " + ex.getMessage());
//        }

        /**
         * --- 5 ---- Stream creation from string
         */

        IntStream streamFromString = "123".chars();

        /**
         * --- 6 ---- from StringBuilder
         */

        Stream.builder().add("a1").add("a2").add("a3").build();

        /**
         * ---- 7----- Parallel stream creation  example
         */

        Stream<Integer> stream = collection.parallelStream();

        /**
         * --- 8 ----- Infinite stream creation from Stream.iterate
         */
//        Stream<Integer> streamFromIterate = Stream.iterate(1, n -> n + 1);
//        streamFromIterate.forEach(System.out::println);

        /**
         * ---- 9 ---- Infinite stream creation from Stream.generate
         */

//        Stream<String> streamFromGenerate = Stream.generate(() -> "a1");
//        streamFromGenerate.forEach(s -> System.out.println());

        // Типы операций в стримах бывают двух типов
        // 1. Конвейерные — возвращают другой stream, то есть работают как builder,
        //2. Терминальные — возвращают другой объект, такой как коллекция, примитивы, объекты,

        String[] arrays = {"Java", "Ruuuuussshhh"};
        Stream<String> streamOfArray = Arrays.stream(arrays);
        streamOfArray.map(s->s.split("")) //Преобразование слова в массив букв
                .flatMap(Arrays::stream).distinct() //выравнивает каждый сгенерированный поток в один поток
                .collect(Collectors.toList()).forEach(System.out::println);

        //Вернуть количество вхождений объекта «a1»
String[] newArray = {"a1","a2","a3","a1","a1"};
String[] veryNewArray = new String[] {"a1","a11","a111"};
Stream<String> stream2 = Arrays.stream(newArray);
long count = stream2.filter("a1"::equals).count();
        System.out.println(count);

    //Вернуть первый элемент коллекции или 0, если коллекция пустая
        System.out.println( Arrays.stream(veryNewArray).findFirst().orElse("0"));
 //Вернуть последний элемент коллекции или «empty», если коллекция пуста
        Stream<String> stream3 = Arrays.stream(veryNewArray);
        System.out.println(stream3.skip(Arrays.stream(veryNewArray).count() - 1).findFirst().orElse("empty"));

    }
}
