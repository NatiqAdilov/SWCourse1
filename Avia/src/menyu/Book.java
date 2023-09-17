package menyu;

import Entity.Flight;
import Entity.User;
import Util.Print;
import database.Database;

import java.util.List;

public class Book {
    Database dataBase = Database.getInstance();

    public List<Flight> searchFlight() {
        String from = Print.getText("enter from flight").toUpperCase();
        String to = Print.getText("enter flight to").toUpperCase();
        List<Flight> flights = Flight.searchFligth(from, to);
        if(flights.isEmpty()){
            System.out.println("Flight not found");
        }
        return flights;
    }
    public void makeBooking(User user){
        List<Flight> flights=searchFlight();
    }

}