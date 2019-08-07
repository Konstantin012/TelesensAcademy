package com.academy.lesson07.homeTask.sortHomeTask.comparator;

import java.util.Comparator;

public class ComprByLastLetter implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        Character ch1 = s1.charAt(s1.length()-1);
        Character ch2 = s2.charAt(s2.length()-1);

        return (ch1.compareTo(ch2));

//        if (ch1 == ch2)
//            return 0;
//        if (ch1 < ch2)
//            return -1;
//        else
//            return 1;
    }
}
