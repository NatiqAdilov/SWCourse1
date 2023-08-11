public class Fish extends Pet {
    private String waterType;

    public Fish(String name, int age, String waterType) {
        super(name, age);
        this.waterType = waterType;
    }

    @Override
    public void eat() {
        System.out.println("Baliqlar yemek yeyir");
    }

    @Override
    public String description() {
        return getName() + ", " + getAge() + " yawinda bir baliqdir";
    }
}
