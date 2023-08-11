import java.util.Random;

public class Proyekt1 {
    public static void main(String[] args) {
        System.out.println("Oyun baslasin!");
        System.out.println("Bir eded daxil edin:");
        Random random = new Random();
        int i = random.nextInt(100);
        System.out.println(i);
    }
}
