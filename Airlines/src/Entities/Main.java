package Entities;

public class Main {
    public static void main(String[] args) {
        Database db = Database.getInstance;
        db.initDatabase();
        Menu menu = new Menu();
        menu.displayMainMenu();
        db.closeDatabase;
    }
}
//27:21