package lld.design.designPattern.creational.abstractFactory;

public class CarHandler {
    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(FuelType.PETROL, CarType.OLD));
        System.out.println(CarFactory.buildCar(FuelType.DIESEL, CarType.NEW));
    }
}
