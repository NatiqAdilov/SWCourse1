package Services;

import Entity.Booking;
import dao.BookingDAO;

import java.util.List;
public class BookingService {

    public boolean makeBooking(Booking booking) {
        return booking.creat(booking);
    }

    public List<Booking> getBookings() {
        return booking.getAll();
    }

    public Entity.Booking getBooking() {
        return bookingDAO.getAll().get(getBooking().getId());
    }
    public boolean makeBooking(List<Booking> booking) {
        return makeBooking(getBookings());
    }
}
