package com.academy.lesson04.task01;

public class SomeNumber {

    private int n;

    public SomeNumber(){
        n =0;
    }
    public SomeNumber(int n){
        this.n =n;
    }
    public int getN(){
        return n;
    }
    public void setN(int n){
        this.n = n;
    }
    public void print(){
        System.out.println(n);
    }
    public boolean isPositive(){

        boolean chec=(n>0) ? true:false;
        return chec;
    }

}


