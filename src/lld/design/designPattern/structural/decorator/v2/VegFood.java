package lld.design.designPattern.structural.decorator.v2;

public class VegFood implements Food {

    @Override
    public String prepareFood() {
        return "Veg Food";
    }

    @Override
    public double foodPrice() {
        return 50;
    }
}
