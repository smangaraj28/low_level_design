package lld.design.designPattern.structural.adapter.v1;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    public void resize() {
        System.out.println("Resizing Square");
    }
}
