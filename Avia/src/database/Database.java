package database;

import Entity.Booking;
import Entity.Flight;
import Entity.User;
import Util.FlightGenerator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Database {

    private static final File flightsFile = new File("src/main/java/com/database", "flights.txt");
    private static final File bookingsFile = new File("src/main/java/com/database", "bookings.txt");
    private static final File usersFile = new File("src/main/java/com/database", "users.txt");

    private final List<Booking> bookings = new ArrayList<>();
    private final List<User> users = new ArrayList<>();
    private final List<Flight> flights = new ArrayList<>();

    private static Database database;

    private Database() {

    }

    public static Database getInstance() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void readFileDatabase() {

        if (usersFile.exists()) {
            loadFileToList(usersFile, users);
        }

        if (bookingsFile.exists()) {
            loadFileToList(bookingsFile, bookings);
        }

        if (flightsFile.exists()) {
            loadFileToList(flightsFile, flights);
        } else {
            flights.addAll(FlightGenerator.genFlights(50));
            saveListToFile(flightsFile, flights);
        }
    }

    public void writeFileDatabase() {
        saveListToFile(usersFile, users);
        saveListToFile(bookingsFile, bookings);
        saveListToFile(flightsFile, flights);
    }


    private void saveListToFile(File file, List list) {

        try {
            FileOutputStream sis = new FileOutputStream(file);
            ObjectOutputStream sos = new ObjectOutputStream(sis);
            sos.writeObject(list);
            sos.close();
            sis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadFileToList(File file, List list) {

        try {
            FileInputStream fis = new FileInputStream(file);
            if (fis.available() > 0) {
                ObjectInputStream ois = new ObjectInputStream(fis);
                List data = (List) ois.readObject();
                list.addAll(data);
                ois.close();
                fis.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
