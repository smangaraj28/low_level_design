package lld.design.designPattern.structural.facade;

public class FPHHandler {
    public static void main(String[] args) {
        FPHBookingFacade facade = new FPHBookingFacade();
        facade.createBooking();
    }
}
