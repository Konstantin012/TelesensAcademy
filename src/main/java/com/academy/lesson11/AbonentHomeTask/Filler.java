package com.academy.lesson11.AbonentHomeTask;


import com.academy.lesson12.SubsciberHomeDB;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;



public class Filler {
    private static String fromConfic = System.getProperty("path");
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
    private Connection connection;
    private  PreparedStatement statement;

    private enum Gender {
        MAN,
        WEMAN;
    }


    public void finalNameSurnameGender() {
        Gender gf = this.randomGender();
        if (gf.equals(Gender.MAN)) {
            names = getNamesOrSurname(malesName);
            surname = getNamesOrSurname(malesSurname);
            genderName = "m";


        } else if (gf.equals(Gender.WEMAN)) {
            names = getNamesOrSurname(femalesName);
            surname = getNamesOrSurname(femalesSurname);
            genderName = "f";
        }


    }

    private Gender randomGender() {
        return Gender.values()[new Random().nextInt(Gender.values().length)];
    }

//    private String generateNumbers() {
//        Operator.Operators value = Operator.Operators.values()[new Random().nextInt(Operator.Operators.values().length)];
//        Operator oper = new Operator();
//        if (value.equals(Operator.Operators.KIEVSTAR)) {
//            oper.setName("Kievstar");
//            operatorsName = oper.getName();
//            return oper.getKiev(Operator.Operators.KIEVSTAR.getNumber());
//        }
//        if (value.equals(Operator.Operators.LIFE)) {
//            oper.setName("Life");
//            operatorsName = oper.getName();
//            return new Operator().getLife(Operator.Operators.LIFE.getNumber());
//        } else{
//            oper.setName("Vodafon");
//            operatorsName = oper.getName();
//            return new Operator().getVodaf(Operator.Operators.VODAFONE.getNumber());
//        }
//    }


//    public String getPropertiesPath(String currentPath) {
//        properties = new Properties();
//        try {
//            properties.load(new FileReader("src/main/resources/path.properties"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return properties.getProperty(currentPath);
//    }

    //без пути
    public String getPropertiesPath(String currentPath) {
        properties = new Properties();
        try {
//            properties.load(new FileReader("src/main/resources/path.properties"));
            properties.load(new FileReader(fromConfic));
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
        openConnection();

        for (int i = 0; i < 2000; i++) {
            Row row = sheet.createRow(i);
            Cell decentNumber = row.createCell(0);
            Cell cellSurname = row.createCell(1);
            Cell cellName = row.createCell(2);
            Cell gender = row.createCell(3);
            Cell cellAge = row.createCell(4);
            Cell cellNumber = row.createCell(5);
            Cell cellOperatorsName = row.createCell(6);

            Operator2 operator2 = new Operator2();
            finalNameSurnameGender();
            String phoneNumb = operator2.getNumber();
            String operName = operator2.getOperator();
            int age = ageGeneration();


            decentNumber.setCellValue(i + 1);
            cellSurname.setCellValue(surname);
            cellName.setCellValue(names);
            gender.setCellValue(genderName);
            cellAge.setCellValue(age);
            cellNumber.setCellValue(phoneNumb);
            cellOperatorsName.setCellValue(operName);

            SubsciberHomeDB.writeToAbonentDB(statement,i+1,names,surname,genderName,age);
        }

        String excelFilePath = this.properties.getProperty(excelFile);
        try (FileOutputStream out = new FileOutputStream(new File(excelFilePath))) {
            workbook.write(out);
        } catch (Exception e) {
            e.printStackTrace();
        }
        closeConnection();

    }

    private void openConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/telesens?user=root&password=root&serverTimezone=UTC&useSSL=false");
            statement = connection.prepareStatement("INSERT INTO abonent VALUES(?,?,?,?,?)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void closeConnection(){
        try {
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}
