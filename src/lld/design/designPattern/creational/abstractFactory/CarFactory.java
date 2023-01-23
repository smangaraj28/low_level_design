package lld.design.designPattern.creational.abstractFactory;

public class CarFactory {

    public static Car buildCar(FuelType fuelType, CarType carType) {
        Car car = null;
        switch (fuelType) {
            case DIESEL:
                //.....
                car = DieselCarFactory.buildCar(carType);
                break;
            case PETROL:
                car = PetrolCarFactory.buildCar(carType);
                break;
        }
        return car;
    }
}

enum CarType {
    OLD, NEW
}

enum FuelType {
    DIESEL, PETROL
}