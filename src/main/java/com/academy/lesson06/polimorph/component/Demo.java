package com.academy.lesson06.polimorph.component;

public class Demo {

    public static void main(String[] args) {
        Label demolabel = new Label(400, 200, 34, 56, "Label");
        Label demoLabel2 = new Label()
                .withXPosition(100)
                .withYPosition(200);

        demolabel.draw();
        System.out.println(demolabel);
    }
}
