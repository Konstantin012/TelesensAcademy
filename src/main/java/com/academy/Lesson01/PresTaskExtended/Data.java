package com.academy.Lesson01.PresTaskExtended;

import java.util.Scanner;
import java.util.Set;

public class Data {
        public String name;
        private String lastName;
        private String otchestvo;
        private Integer age;
        private String gender;
        private Integer number;

        public Data ()
        {
            name = SetMethod("> Введите Имя");
            lastName = SetMethod("> Введите Фамилию");
            otchestvo = SetMethod("> Введите Отчество");
            age = IntMethod("> Введите Возраст");
            gender = SetMethod("> Введите Пол (м/ж)");
            number = IntMethod("> Введите Номер (10 цифр):");
        }

        private String SetMethod(String sentence)
        {
            Scanner scan = new Scanner(System.in);
            System.out.print(sentence);
            return scan.nextLine();
        }

        private int IntMethod(String sentence)
        {
            boolean check = true;
            String temp = "";
            do{
                temp = SetMethod(sentence);
                check = tryParseInt(temp);
                if (!check)
                {
                    System.out.print("Вы ввели неверный возраст, попробуйте еще раз");
                }
            }while (check == true);
            Integer i = Integer.parseInt(temp);
            return i;
        }
    boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }
}
