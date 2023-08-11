public class Main {
    public static void main(String[] args) {
        audibleMethod(() -> System.out.println("Dog is barking"));
        audibleMethod(() -> System.out.println("Cat is meowing"));
    }
    public static void audibleMethod(Audible audible){
        audible.makeNoise();
    }
}