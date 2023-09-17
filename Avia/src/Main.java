import Entity.Flight;
import Util.FlightGenerator;
import database.Database;
import menyu.Menu;

import java.util.List;

public class Main {
        public static void main(String[] args) {
            Database dataBase = Database.getInstance();
            dataBase.readFileDatabase();
            Menu menu = new Menu();
            menu.displayMenu();
            List<Flight> flights = FlightGenerator.genFlights(50);
            flights.forEach(System.out::println);
        }
    }