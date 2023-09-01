package menyu;

import Entity.Flight;
import Entity.User;
import Util.Print;
import database.Database;

import java.util.List;
import java.util.Scanner;

public class Menu {
    public void displayMenu() {
        Database db = Database.getInstance();
        List<User> users = db.getUsers();
        List<Flight> flights = db.getFlights();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        Login login = new Login();
        Register register = new Register();
        boolean b = true;
        while (b) {
            Print.mainMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    login.login();
                }
                case 2 -> register.userRegister();
                case 3 -> flights.forEach(System.out::println);
                case 4 -> System.exit(0);
                default -> System.out.println("operation failed!");
            }
        }
    }
}