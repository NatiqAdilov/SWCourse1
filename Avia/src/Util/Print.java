package Util;

    import java.util.Scanner;

    public class Print {
        public static void mainMenu() {
            System.out.println("""
                    1. Login
                    2. Register
                    3. Flight lists
                    4. Exit""");
        }

        public static void userMenu() {
            System.out.println("""
                    1. View flights
                    2. Search booking
                    3. Make booking
                    4. View booking list
                    5. Cancel booking
                    6. logout
                    7. Exit""");
        }

        public static String getText(String text) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("%s: ", text);
            return scanner.nextLine();
        }

        public static int getNum(String text) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("%s: ", text);
            return scanner.nextInt();
        }
    }