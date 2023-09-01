package Services;

import Entity.Flight;
import dao.FlightDAO;

import java.util.List;

public class FlightService {
    private FlightDAO flightDAO = new FlightDAO();

    public List<Flight> getFlights() {
        return flightDAO.getAll();
    }

    public Flight getFlight(String code) {
        return flightDAO.getAll().stream().filter(f -> f.getCode().equals(code)).findFirst().get();
    }

    public List<Flight> searchFlight(String from, String to) {
        return flightDAO.getAll().stream().filter(f -> f.getFrom().toString().equals(from)
                && f.getTo().toString().equals(to)).toList();
    }
}