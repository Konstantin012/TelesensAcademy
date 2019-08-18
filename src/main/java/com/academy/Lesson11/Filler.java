package com.academy.Lesson11;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;


public class Filler {
    private Properties properties;
    private static String femalesName = "femalesName.path";
    private static String femalesSurname = "femalesSurname.path";
    private static String malesName = "malesName.path";
    private static String malesSurname = "malesSurname.path";
    private static String excelFile = "excelFile.path";
    public static final String SHEET = "Complex Data";
    private String names;
    private String surname;
    private String genderName;
    private String operatorsName;

    private enum Gender {
        MAN(malesName, malesSurname),
        WEMAN(femalesName, femalesSurname);

        private String name;
        private String surName;

        Gender(String name, String surName) {
            this.name = name;
            this.surName = surName;
        }

        public String getName() {
            return name;
        }

        public String getSurName() {
            return surName;
        }
    }


    public void finalNameOrSurname() {
        Gender gf = this.randomGender();
        if (gf.equals(Gender.MAN)) {
            names = getNamesOrSurname(Gender.MAN.name);
            surname = getNamesOrSurname(Gender.MAN.surName);
            genderName = "м";


        } else if (gf.equals(Gender.WEMAN)) {
            names = getNamesOrSurname(Gender.WEMAN.name);
            surname = getNamesOrSurname(Gender.WEMAN.surName);
            genderName = "ж";
        }


    }

    private Gender randomGender() {
        return Gender.values()[new Random().nextInt(Gender.values().length)];
    }

    private String generateNumbers() {
        Operator.Operators value = Operator.Operators.values()[new Random().nextInt(Operator.Operators.values().length)];
        Operator oper = new Operator();
        if (value.equals(Operator.Operators.KIEVSTAR)) {
            oper.setName("Kievstar");
            operatorsName = oper.getName();
            return oper.getKiev(Operator.Operators.KIEVSTAR.getNumber());
        }
        if (value.equals(Operator.Operators.LIFE)) {
            oper.setName("Life");
            operatorsName = oper.getName();
            return new Operator().getLife(Operator.Operators.LIFE.getNumber());
        } else{
            oper.setName("Vodafon");
            operatorsName = oper.getName();
            return new Operator().getVodaf(Operator.Operators.VODAFONE.getNumber());
        }
    }


    public String getPropertiesPath(String currentPath) {
        properties = new Properties();
        try {
            properties.load(new FileReader("src/main/resources/path.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(currentPath);
    }

    public String getNamesOrSurname(String currentPath) {
        Random random = new Random();
        ArrayList<String> list = new ArrayList<>();
        try {
            Scanner s = new Scanner(new File(getPropertiesPath(currentPath)));
            while (s.hasNext()) {
                list.add(s.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list.get(random.nextInt(list.size()));

    }

    public int ageGeneration() {
        return (int) (5 + Math.random() * 94);
    }


    public void fillingExcel() {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(SHEET);

        for (int i = 0; i < 2000; i++) {
            Row row = sheet.createRow(i);
            Cell decentNumber = row.createCell(0);
            Cell cellSurname = row.createCell(1);
            Cell cellName = row.createCell(2);
            Cell gender = row.createCell(3);
            Cell cellAge = row.createCell(4);
            Cell cellNumber = row.createCell(5);
            Cell cellOperatorsName = row.createCell(6);

            finalNameOrSurname();
            decentNumber.setCellValue(i+1);
            cellSurname.setCellValue(surname);
            cellName.setCellValue(names);
            gender.setCellValue(genderName);
            cellAge.setCellValue(ageGeneration());
            cellNumber.setCellValue(generateNumbers());
            cellOperatorsName.setCellValue(operatorsName);

        }

        String excelFilePath = this.properties.getProperty(excelFile);
        try (FileOutputStream out = new FileOutputStream(new File(excelFilePath))) {
            workbook.write(out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
