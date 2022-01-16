package com.academy.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    /**
     * PECS (Producer Extends Consumer Super) is a principle for Wildcard in generics syntax ?
     * Upper Bounded Wildcards - <? extends Number>
     * Unbounded Wildcards - <?>
     * Lower Bounded Wildcards - <? super Integer>
     */

        public static class TestClass {
            public static void print(List<? super String> list) {
                list.add("Hello,");
                System.out.println(list.get(0));
            }
        }

        public static void main(String []args) {
            List<String> list = new ArrayList<>();
           // list.add(" Daria");
            TestClass.print(list);
        }
    }
