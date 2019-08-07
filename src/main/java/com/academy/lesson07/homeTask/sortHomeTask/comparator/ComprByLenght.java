package com.academy.lesson07.homeTask.sortHomeTask.comparator;

import java.util.Comparator;

public class ComprByLenght implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {

        if(s1.length()==s2.length()){
            return s1.compareToIgnoreCase(s2);
        }
        if(s1.length()<s2.length())
            return -1;
        else
            return 1;
    }
}
