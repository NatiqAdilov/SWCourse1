import java.util.Random;
import java.util.Scanner;

public class TahminOyunu {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(101); // 0-100 arası təsadüfi bir rəqəm yaradır.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Adınızı daxil edin: ");
        String playerName = scanner.nextLine();

        System.out.println("Oyun başlasın!");

        while (true) {
            System.out.print("Təxmin etdiyiniz rəqəmi daxil edin: ");
            int guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Sizin nömrəniz çox kiçikdir. Zəhmət olmasa, yenidən cəhd edin.");
            } else if (guess > randomNumber) {
                System.out.println("Nömrəniz çox böyükdür. Zəhmət olmasa, bir daha cəhd edin.");
            } else {
                System.out.println("Təbriklər, " + playerName + "! Doğru nömrəni tapdınız.");
                break;
            }
        }

        scanner.close();
    }
}

