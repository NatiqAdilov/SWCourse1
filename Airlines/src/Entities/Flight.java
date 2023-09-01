package Entities;



import java.util.List;

public class Flight {
    private FlightService flightService = new FlightService();

    public List<Flight> getFlights() {
        return flightService.getFlights();
    }

    public Flight getFlight(String code) {
        return flightService.getFlight(code);
    }

    public List<Flight> searchFligth(String from, String to) {
        return flightService.searchFlight(from, to);
    }

}