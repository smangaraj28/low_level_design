package lld.design.designPattern.structural.decorator.v2;

public abstract class FoodDecorator implements Food {
    // Composition
    private Food newFood;

    // newFood = vegFood
    public FoodDecorator(Food newFood) {
        if (newFood == null) {
            this.newFood = null;
        }
        this.newFood = newFood;
    }

    @Override
    public String prepareFood() {
        if(newFood == null) {
            return "";
        }
        return newFood.prepareFood();
    }

    @Override
    public double foodPrice() {
        if(newFood == null) {
            return 0;
        }
        return newFood.foodPrice();
    }
}