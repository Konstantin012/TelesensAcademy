package com.academy.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class GameDeserialize {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\daria\\OneDrive\\Desktop\\trash\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        GameSerialize savedGame = (GameSerialize) objectInputStream.readObject();

        System.out.println(savedGame);
    }
}
