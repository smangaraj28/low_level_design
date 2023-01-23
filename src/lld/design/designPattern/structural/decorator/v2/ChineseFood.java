package lld.design.designPattern.structural.decorator.v2;

public class ChineseFood extends FoodDecorator {
    public ChineseFood(Food newFood) {
        super(newFood);
    }

    public String prepareFood() {
        return super.prepareFood() + " With Fried Rice and Manchurian  ";
    }

    public double foodPrice() {
        return super.foodPrice() + 65;
    }
}
