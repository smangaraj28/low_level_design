package lld.design.designPattern.creational.abstractFactory;

public abstract class Car {
    abstract void construct();

    CarType carType = null;
    FuelType fuelType = null;

    Car(CarType carType, FuelType fuelType) {
        this.carType = carType;
        this.fuelType = fuelType;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }


    @Override
    public String toString() {
        return "CarModel - " + carType + " with fuel type : " + fuelType;
    }
}
