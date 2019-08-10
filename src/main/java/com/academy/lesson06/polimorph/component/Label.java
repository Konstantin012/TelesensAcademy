package com.academy.lesson06.polimorph.component;

public class Label extends Component {

    public Label() {
    }

    public Label(Integer xPosition, Integer yPosition, Integer width, Integer height, String text) {
        super(xPosition, yPosition, width, height, text);
    }

    @Override
    public void draw() {
        System.out.println("Label");
    }

    public Label withXPosition(int xPosition) {
        setxPosition(xPosition);
        return this;
    }

    public Label withYPosition(int yPosition) {
        setyPosition(yPosition);
        return this;
    }
}
