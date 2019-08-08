package com.academy.lesson07.homeTask.component;


public class Button implements Component {
    private String text = "NoName";

//    -продемонстрировать работу метода drawHome()
    @Override
    public void drawHome() {
        System.out.println("Implementation of drawHome method");
    }

//    		- перекрыть метод draw3D
    @Override
    public void draw3DHome() {
        System.out.println("Implementation of draw3D method by inheritor");
    }

    @Override
    public void draw() {
        System.out.println("I'm Button");
    }

    public void print() {
        System.out.println("My text is next: " + text);
    }
}
