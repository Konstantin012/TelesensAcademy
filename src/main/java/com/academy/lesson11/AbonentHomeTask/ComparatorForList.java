package com.academy.lesson11.AbonentHomeTask;

import java.util.Comparator;


public class ComparatorForList implements Comparator<Subscriber> {
    @Override
    public int compare(Subscriber sub1, Subscriber sub2) {
        String operator1=sub1.getOperator().getOperator();
        String operator2=sub2.getOperator().getOperator();

        Integer age1 = sub1.getAge();
        Integer age2 = sub2.getAge();

        String lastName1=sub1.getLastName();
        String lastName2=sub2.getLastName();

        String firstName1=sub1.getFirstName();
        String firstName2=sub2.getFirstName();

        if(operator1.equals(operator2)){
            if(age1.equals(age2)){
                if(lastName1.equals(lastName2)){
                    return firstName1.compareTo(firstName2);
                }
                return lastName1.compareTo(lastName2);
            }
            return age1.compareTo(age2);
        }
        else {
            return operator1.compareTo(operator2);
        }


    }
}
