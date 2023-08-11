package Ders2;

import java.util.Scanner;

public class Kvadrat {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a==b){
            System.out.println("Bu fiqur Kvadratdir.");
        }
        else {
            System.out.println("Bu fiqur Duzbucaqlidir.");
        }
    }
}
