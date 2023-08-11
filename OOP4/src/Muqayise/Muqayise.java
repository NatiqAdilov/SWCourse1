package Muqayise;

import java.util.Scanner;

public class Muqayise {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int eded1 = scanner.nextInt();
        int eded2 = scanner.nextInt();
        if (eded1>eded2){
            System.out.println(eded1 + " boyukdur "+eded2+ "-den");
        }
        else{
            System.out.println(eded2+" boyukdur "+ eded1 + "-den");
        }
    }
}
