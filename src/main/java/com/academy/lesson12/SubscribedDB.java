package com.academy.lesson12;

import java.sql.*;

public class SubscribedDB {
    public static void main(String[] args) {
        //добавляет депенденси в пум файл
        //загружаем драйвер

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/telesens?user=root&password=root&serverTimezone=UTC&useSSL=false");
            //SELECT
            Statement statement = connection.createStatement();
            //берем данные с базы
            ResultSet resultSet = statement.executeQuery("SELECT * FROM operator");
            //считывает с переменной взятые данные
            while (resultSet.next()) {
                String first_name = resultSet.getString("name");
                System.out.println(first_name);
            }
            //INSERT
            connection.prepareStatement("INSERT INTO abonent");
            //////////////////смотри код Олега
            resultSet.close();
            connection.close();
            } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }



    }
}
