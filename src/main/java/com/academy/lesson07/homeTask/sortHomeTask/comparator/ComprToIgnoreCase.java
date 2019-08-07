package com.academy.lesson07.homeTask.sortHomeTask.comparator;

import java.util.Comparator;

public class ComprToIgnoreCase implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
            return s1.compareToIgnoreCase(s2);
        }

    }

