package com.academy.lesson06.polimorph.component;

import java.util.Objects;

public abstract class Component {
    private Integer xPosition;
	private Integer yPosition;
	private Integer width;
	private Integer height;
	private String text; // надпись кнопки

    public Component() {
        this.xPosition = 0;
        this.yPosition = 0;
        this.width = 10;
        this.height = 12;
        this.text = "textnew";
    }

    public Component(Integer xPosition, Integer yPosition, Integer width, Integer height, String text) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.width = width;
        this.height = height;
        this.text = text;
    }

    public abstract void draw();

    public Integer getxPosition() {
        return xPosition;
    }

    public void setxPosition(Integer xPosition) {
        this.xPosition = xPosition;
    }

    public Integer getyPosition() {
        return yPosition;
    }

    public void setyPosition(Integer yPosition) {
        this.yPosition = yPosition;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Component{" +
                "xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                ", width=" + width +
                ", height=" + height +
                ", text='" + text + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Component component = (Component) o;
        return Objects.equals(xPosition, component.xPosition) &&
                Objects.equals(yPosition, component.yPosition) &&
                Objects.equals(width, component.width) &&
                Objects.equals(height, component.height) &&
                Objects.equals(text, component.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xPosition, yPosition, width, height, text);
    }
}
