package lld.design.designPattern.structural.adapter.v1;

import java.util.ArrayList;
import java.util.List;

public class DrawService {
    List<Shape> shapeList = new ArrayList<>();

//    public DrawService() {
//        super();
//    }

    public void addShape(Shape shape) {
        shapeList.add(shape);
    }

    public List<Shape> getShapes() {
        return new ArrayList<Shape>(shapeList);
    }

    public void draw() {
        if(shapeList.isEmpty()) {
            System.out.println("Nothing to Draw");
        } else {
            shapeList.stream().forEach(shape -> shape.draw());
        }
    }

    public void resize() {
        if(shapeList.isEmpty()) {
            System.out.println("Nothing to Resize");
        } else {
            shapeList.stream().forEach(shape -> shape.resize());
        }
    }

}
