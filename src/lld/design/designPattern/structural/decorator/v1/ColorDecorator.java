package lld.design.designPattern.structural.decorator.v1;

import lld.design.designPattern.structural.adapter.v1.Shape;

public class ColorDecorator extends ShapeDecorator {
    protected Color color;

    public ColorDecorator(Shape decoratedShape, Color color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Fill color : " + color);
    }

    @Override
    public void resize() {
        decoratedShape.resize();
    }
}

enum Color {
    RED,
    GREEN,
    BLUE,
    YELLOW;
}
