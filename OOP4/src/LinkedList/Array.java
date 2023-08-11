package LinkedList;
import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red");
        Scanner scanner = new Scanner(System.in);
        String searchColor = scanner.next();
        boolean found = colors.contains(searchColor);
        if (found){
            System.out.println(" Axtardiginiz reng listde movcuddur!");
        }
        else {
            System.out.println("Axtardiginiz eded listde movcud deyil!");
        }
    }
}
