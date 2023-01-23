package lld.design.designPattern.structural.facade;

//Shopkeeper
public class FPHBookingFacade {
    private HotelBookingService hotelBookingService;
    private FlightBookingService flightBookingService;

    public FPHBookingFacade() {
        this.hotelBookingService = new HotelBookingService();
        this.flightBookingService = new FlightBookingService();
    }

    public void createBooking() {
        System.out.println("Creating a Booking");
        this.hotelBookingService.bookHotel();
        this.flightBookingService.bookFlight();
    }
}
