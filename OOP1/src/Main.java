public class Main {
    public static void main(String[] args) {
        Circle<Integer> circle1 = new Circle<>(5);
        double sahe = circle1.getSahe();
        double cevre = circle1.getCevre();
        System.out.println("Dairenin Sahesi: " + sahe);
        System.out.println("Dairenin Cevresi: " + cevre);
        Circle<Double> circle2 = new Circle<>(3.5);
        double sahe2 = circle2.getSahe();
        double cevre2 = circle2.getCevre();
        System.out.println("Daire 2 Sahəsi: " + sahe2);
        System.out.println("Daire 2 Cevresi: " + cevre2);
    }
}