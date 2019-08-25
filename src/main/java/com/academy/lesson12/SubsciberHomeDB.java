package com.academy.lesson12;

import java.sql.PreparedStatement;
import java.util.concurrent.TimeUnit;

public class SubsciberHomeDB {

    public static void writeToAbonentDB(PreparedStatement statement, int id, String name, String surName, String gender, int age ) {
        try {
            statement.setInt(1,id);
            statement.setString(2,name);
            statement.setString(3,surName);
            statement.setString(4,gender);
            statement.setInt(5,age);
            statement.execute();
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
