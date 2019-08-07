package com.academy.lesson07.homeTask;

import java.util.Comparator;

public class String3LetterComparator implements Comparator<String> {
    private static final int NUMBER_LETTER =2;
    @Override
    public int compare(String s1, String s2) {
        char c1 = s1.charAt(NUMBER_LETTER);
        char c2 = s1.charAt(NUMBER_LETTER);
        if(c1 == c2)
            return 0;

        if(c1<c2)
            return -1;

        else
            return 1;

    }
}
