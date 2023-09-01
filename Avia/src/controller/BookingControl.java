package controller;

import Entity.Booking;
import Services.BookingService;
public class BookingControl {
    private BookingService bookingService = new BookingService();

    public boolean makeBooking(Booking booking) {

        return bookingService.makeBooking(booking);
    }
}
