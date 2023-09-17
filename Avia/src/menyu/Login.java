package menyu;

import Entity.Flight;
import Entity.User;
import Util.Print;
import database.Database;

import java.util.List;
import java.util.Scanner;

public class Login {
    Register register=new Register();
    boolean b = false;

    public void login() {
        String userName = Print.getText("Enter username");
        String password = Print.getText("Enter password");
        User user = User.getUser(userName, password);
        if (user == null) {
            System.out.println("login failed!");
        } else {
            System.out.println("login successfull\nWelcome " + user.getName() + " " + user.getSurname());
            b = true;
            displayUserMenu(user);
        }
    }

    public void displayUserMenu(User user) {
        Database db = Database.getInstance();
        List<Flight> flights = db.getFlights();
        Book book = new Book();
        int choice = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Print.userMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> flights.forEach(System.out::println);
                case 2 -> book.searchFlight().forEach(System.out::println);
                case 3 -> book.makeBooking(user);
                case 4 -> System.out.println("bileti cancel edilecek");
                case 5 -> {
                    System.out.println("logout successfuly");
                    login();
                }
                case 6 -> {
                    System.out.println("System exit");
                    Database dataBase = Database.getInstance();
                    dataBase.getUsers().stream().forEach(System.out::println);
                    System.exit(0);
                }
                default -> System.out.println("Duzgun giriw edin");
            }
        }
    }
}