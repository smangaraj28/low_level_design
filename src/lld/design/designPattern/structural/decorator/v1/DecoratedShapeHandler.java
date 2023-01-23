package lld.design.designPattern.structural.decorator.v1;

import lld.design.designPattern.structural.adapter.v1.Circle;
import lld.design.designPattern.structural.adapter.v1.Shape;
import lld.design.designPattern.structural.adapter.v1.Square;

public class DecoratedShapeHandler {
    public static void main(String[] args) {
        System.out.println("Creating shapes without any extra features");
        Shape square = new Square();
        Shape circle = new Circle();

        System.out.println("Drawing simple Shape objects");
        square.draw();
        circle.draw();

        System.out.println("Creating decorator shapes ");
        Shape circle1 = new ColorDecorator(circle, Color.YELLOW);
        circle1.draw();

        Shape square1 = new ColorDecorator(square, Color.GREEN);
        square1.draw();
    }
}
