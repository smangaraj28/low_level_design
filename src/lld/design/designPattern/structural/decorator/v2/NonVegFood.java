package lld.design.designPattern.structural.decorator.v2;

public class NonVegFood extends FoodDecorator {

    public NonVegFood() {
        super(null);
    }
    // newFood = vegFood
    public NonVegFood(Food newFood) {
        super(newFood);
    }

    public String prepareFood() {
        return super.prepareFood() + " With Roasted Chiken and Chiken Curry  ";
    }

    public double foodPrice() {
        return super.foodPrice() + 150;
    }

}
