package com.academy.lesson04.task03a;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Currency {
    private double value;
    private String name;

    public Currency(){}

    public Currency(double value, String name){
        this.value = value;
        this.name = name;
    }

    public Currency(Currency currency){     //Конструктор копирования????

    }

    public void print(){
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println(formatter.format(value)+name);
    }

    public boolean isEqual(Currency currency){
        if(currency.equals(new Currency())){
            return true;
        }
        if (currency.value == this.value & currency.name == this.name){
            return true; //метод equal не работатет??
        }
        else return false;
    }

    public void add(double anotherValue, String anotherName){
        if(!anotherName.equals(name)){
            System.out.printf("Error: currency names are differ '%s' - '%s' ", anotherName, name);
        }
        else if(anotherName.equals(name)){
            value =value + anotherValue;
        }
    }

    public void add(Currency currency){

    }

    public void substract(double value, String name){
        if(!name.equals(this.name)){
            System.out.printf("Error: currency names are differ '%s' - '%s' ", this.name, name);
        }
        else if(name.equals(this.name)){
            this.value = this.value - value;
        }
    }
    public void substract(Currency currency){

    }


}
