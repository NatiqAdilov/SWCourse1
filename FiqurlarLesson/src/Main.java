import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String[] args) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            int[] playerNumbers = new int[0];
            String playerName;

            System.out.println("Oyun bawlasın!");

            while (true) {
                int secretNumber = random.nextInt(10); // 0-100 arası təsadüfi bir rəqəm

                System.out.print("Adınızı daxil edin: ");
                playerName = scanner.nextLine();

                System.out.print("Texmin etdiyiniz reqemi daxil edin (0-10): ");
                int guess;
                try {
                    guess = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Yalnıw format! Zəhmət olmasa, bir rəqəm daxil edin.");
                    continue;
                }

                playerNumbers = addNumber(playerNumbers, guess);

                if (guess < secretNumber) {
                    System.out.println("Sizin reqeminiz çox kicikdir. Zehmet olmasa, yeniden cehd edin.");
                } else if (guess > secretNumber) {
                    System.out.println("Nomreniz cox böyükdür. Zehmet olmasa bir daha cehd edin.");
                } else {
                    System.out.println("Tebrikler, %s!\n" + playerName);
                }

                System.out.print("Davam etmek isteyirsiniz? (beli/her hansı bir simvol): ");
                String answer = scanner.nextLine();
                if (!answer.equalsIgnoreCase("beli")) {
                    System.out.println(" ");
                }
            }


        }

        public static int[] addNumber(int[] numbers, int number) {
            int[] newArray = Arrays.copyOf(numbers, numbers.length + 1);
            newArray[newArray.length - 1] = number;
            return newArray;
        }

        public static void displayNumbers(int[] numbers) {
            Arrays.sort(numbers);
            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }
    }