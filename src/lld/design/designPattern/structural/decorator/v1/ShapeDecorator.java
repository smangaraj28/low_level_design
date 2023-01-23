package lld.design.designPattern.structural.decorator.v1;

import lld.design.designPattern.structural.adapter.v1.Shape;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        super();
        this.decoratedShape = decoratedShape;
    }
}
