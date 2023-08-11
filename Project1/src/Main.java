import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adinizi daxil edin: ");
        String Name = scanner.nextLine();

        System.out.println("Oyun bashlasin!");

        boolean gameFinish = false;
        while (!gameFinish) {
            int randomNumber = random.nextInt(101);
            int a = 0;

            while (true) {
                System.out.print("Texmin etdiyiniz ededi daxil edin: ");
                int guess = scanner.nextInt();
                a++;

                if (guess < randomNumber) {
                    System.out.println("Sizin nomreniz chox kichikdir. Zehmet olmasa, yeniden cehd edin.");
                } else if (guess > randomNumber) {
                    System.out.println("Nomreniz chox boyukdur. Zehmet olmasa, bir daha cehd edin.");
                } else {
                    System.out.println("Tebrikler, " + Name + "! Dogru nomreni tapdınız."+a+ "defe cehd etdiniz");
                    break;
                }
            }
            System.out.print("Yeni oyun oynamaq isteyirsiniz? (Beli/Xeyr): ");
            String response = scanner.next();

            if (!response.equalsIgnoreCase("Beli")) {
                gameFinish = true;
            }

            scanner.nextLine();
        }
    }
}