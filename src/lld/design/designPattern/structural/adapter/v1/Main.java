package lld.design.designPattern.structural.adapter.v1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creating drawing shapes");
        DrawService drawService = new DrawService();
        drawService.addShape(new Square());
        drawService.addShape(new Circle());

        System.out.println("Drawing ....");
        drawService.draw();
        System.out.println("Resizing ....");
        drawService.resize();
    }
}
