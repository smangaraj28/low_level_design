package lld.design.designPattern.creational.abstractFactory;

public class OldCar extends Car {
    OldCar(FuelType fuelType) {
        super(CarType.OLD, fuelType);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Constructing old Car");
    }
}
