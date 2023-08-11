package Ders2;

import java.util.Scanner;

public class BoyukEdedTapma {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int eded1 = scanner.nextInt();
        int eded2= scanner.nextInt();
        int eded3= scanner.nextInt();
        if(eded1>eded2 && eded1>eded3){
            System.out.println("En boyuk eded = "+eded1);
        } else if (eded2>eded1 && eded2>eded3) {
            System.out.println("En boyuk eded = "+eded2);
        }
        else {
            System.out.println("En boyuk eded = "+ eded3);
        }
    }
}
