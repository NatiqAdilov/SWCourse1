import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı daxil edin: ");
        String playerName = scanner.nextLine();

        System.out.println("Oyun başlasın!");

        boolean gameFinished = false;
        while (!gameFinished) {
            int randomNumber = random.nextInt(101); // 0-100 arası təsadüfi bir rəqəm yaradır.
            int attempts = 0;

            while (true) {
                System.out.print("Təxmin etdiyiniz rəqəmi daxil edin: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < randomNumber) {
                    System.out.println("Sizin nömrəniz çox kiçikdir. Zəhmət olmasa, yenidən cəhd edin.");
                } else if (guess > randomNumber) {
                    System.out.println("Nömrəniz çox böyükdür. Zəhmət olmasa, bir daha cəhd edin.");
                } else {
                    System.out.println("Təbriklər, " + playerName + "! Doğru nömrəni tapdınız. Cəhdləriniz: " + attempts);
                    break;
                }
            }

            System.out.print("Yeni oyun oynamak istəyirsinizmi? (Bəli/Heyrət): ");
            String response = scanner.next();

            if (!response.equalsIgnoreCase("Bəli")) {
                gameFinished = true;
            }

            scanner.nextLine(); // Boş satırı oxumaq üçün
        }
    }
}
