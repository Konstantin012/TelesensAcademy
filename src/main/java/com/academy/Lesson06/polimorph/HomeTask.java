package com.academy.Lesson06.polimorph;


import java.awt.*;

public class HomeTask {


    public static void main(String[] args) {
        Component[] components = new Component[10];
        components[0] = new Label();
        components[1] = new Checkbox();
        components[2] = new Button();
        components[3] = new Scrollbar();
        components[4] = new List();
        components[5] = new Choice();
        components[6] = new Canvas();
        components[7] = new Panel();
        components[8] = new TextArea();
        components[9] = new TextField();

        for (Component a: components ) {
            System.out.println(a);
        }

        System.out.println("-------Only Button-------");
        for (Component b: components) {
            if(b instanceof Button){
                System.out.println(b);
            }
        }

    }

}
