package com.academy.Lesson11;

import java.util.Random;

public class Operator {
    private Long id;
    private String name;

    public Operator(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Operator() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public enum Operators {
        LIFE(generateLastNumber()),
        KIEVSTAR(generateLastNumber()),
        VODAFONE(generateLastNumber());

        private int number;

        public int getNumber() {
            return number;
        }

        Operators(int number) {
            this.number = number;
        }
    }


    public static int generateLastNumber()
    {
        return  (int)(1000000 + (Math.random()*8999999));
    }


    public String getLife(int numb) {
        String s = prefForLife() + numb;
        return s;
    }

    public String getKiev(int numb) {
        String g = prefForKiev()+numb;
return g;
    }

    public String getVodaf(int numb) {
        String s = prefForVodaf() + numb;
        return s;
    }



    private String prefForLife(){
        String[] prefArray = {"38063","38093","38073"};
        Integer selectedPref = new Random().nextInt(prefArray.length);
        return prefArray[selectedPref];
    }

    private String prefForKiev(){
        String[] prefArray = {"38097","38067","38098"};
        Integer selectedPref = new Random().nextInt(prefArray.length);
        return prefArray[selectedPref];
    }

    private String prefForVodaf(){
        String[] prefArray = {"38050","38066","38095"};
        Integer selectedPref = new Random().nextInt(prefArray.length);
        return prefArray[selectedPref];
    }
}
