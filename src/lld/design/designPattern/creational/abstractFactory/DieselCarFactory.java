package lld.design.designPattern.creational.abstractFactory;

public class DieselCarFactory {
    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
            case OLD:
                car = new OldCar(FuelType.DIESEL);
                break;
            case NEW:
                car = new NewCar(FuelType.DIESEL);
                break;
            default:
                break;
        }
        return car;
    }
}
