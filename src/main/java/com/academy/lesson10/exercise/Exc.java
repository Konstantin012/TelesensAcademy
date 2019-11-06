package com.academy.lesson10.exercise;

import com.academy.lesson07.сlassTask.sort.model.Person;

import java.util.*;


public class Exc {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person(1L, 10, "Helen"));
        list.add(new Person(3L, 16, "Kolya"));
        list.add(new Person(8L, 63, "Peter"));


        System.out.println("Вывод Листа");
        System.out.println(list);

        System.out.println("      ");
        System.out.println("Вывод Массива");
        Person[] peopleArray = convertListToArray(list);
        Person[] peopleArra2y = list.toArray(new Person[]{});
        System.out.println(Arrays.toString(peopleArray));

        System.out.println("      ");
        System.out.println("Вывод Листа после перевода из массива");
        List<Person> newListOfPerson = convertArrayToList(peopleArray);
        newListOfPerson.add(0,new Person(7L,18,"Sergey"));
        System.out.println(newListOfPerson);

        System.out.println("      ");
        System.out.println("Вывод Map после конвертации из массива");
        Map<Long,Person> map = convertArrayToMap(peopleArray);
        for (Map.Entry<Long, Person> item :map.entrySet()){
            System.out.println(
                    String.format("Key-> %s, value-> %s", item.getKey(), item.getValue()));
        }

        checkEqualLists(list,newListOfPerson);
        checkEqualLists(list,list);

        System.out.println("      ");
        System.out.println("Вывод Листа после перевода из Map");
        List<Person> lisPer = convertMapToList(map);
        System.out.println(lisPer);

        System.out.println("      ");
        System.out.println("Вывод Массива Имен после перевода из Листа");
        String[] stArray = convertListToModelArray(lisPer);
        System.out.println(Arrays.toString(stArray));

        System.out.println("Отсортированный лист по возрасту");
        List<Person> lastTask = filterByAge(newListOfPerson);
        System.out.println(lastTask);
    }

    // TODO - конвертировать List в массив
    public static Person[] convertListToArray(List<Person> list) {
        Person[] array = list.toArray(new Person[]{});
        return array;

    }

    // TODO - конвертировать массив в List
    public static List<Person> convertArrayToList(Person[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    // TODO - конвертировать массив в Map в качестве ключа взять поле id
    public static Map<Long, Person> convertArrayToMap(Person[] array) {

        Map<Long, Person> map = new HashMap<>();
        Set<Long> keys = map.keySet();
        for (int i=0;i<array.length;i++){
            map.put(array[i].getId(),array[i]);
        }
        return map;
    }


    // TODO - проверить, равны ли два списка
    public static boolean checkEqualLists(List<Person> list1, List<Person> list2) {
        Collections.sort(list1);
        Collections.sort(list2);
        Set<Person> setFromList1 = new HashSet<>(list1);
        Set<Person> setFromList2 = new HashSet<>(list2);
        System.out.println(setFromList1.equals(setFromList2));
        return (list1.equals(list2));
    }

    // TODO - конвертировать Map в List
    public static List<Person> convertMapToList(Map<Long, Person> map) {
        return new ArrayList<Person>(map.values());
    }

    // TODO - конвертировать List в Массив (массив содержит только String - значения поля name)
    public static String[] convertListToModelArray(List<Person> list) {
        List<String> tempList = new ArrayList<>();
        for (Person element:list) {
            tempList.add(element.getName());
        }
        String[] array = tempList.toArray(new String[0]);
        return array;
    }

    // TODO - конвертировать отфильтровать List, оставив только позиции по возрасту
    public static List<Person> filterByAge(List<Person> list) {
        Compic pcomp = new Compic();
        list.sort(pcomp);
        return list;
    }
}

