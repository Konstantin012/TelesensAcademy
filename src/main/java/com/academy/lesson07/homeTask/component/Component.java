package com.academy.lesson07.homeTask.component;

public interface Component extends VisualComponent {
    void draw();
    default void drawTransparent() {
        System.out.println("Draw default");
    }
}
