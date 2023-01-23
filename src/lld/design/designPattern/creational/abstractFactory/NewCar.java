package lld.design.designPattern.creational.abstractFactory;

public class NewCar extends Car {
    NewCar(FuelType fuelType) {
        super(CarType.NEW, fuelType);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Constructing new Car");
    }
}
