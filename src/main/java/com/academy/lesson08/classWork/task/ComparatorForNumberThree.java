package com.academy.lesson08.classWork.task;

        import java.util.Comparator;

public class ComparatorForNumberThree implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        String one = s1.split("_")[1];
        String two = s2.split("_")[1];

        int i1 = Integer.parseInt(one);
        int i2 = Integer.parseInt(two);
        if (i1 == i2)
            return 0;
        if (i1 < i2)
            return -1;
        else
            return 1;

    }
}
