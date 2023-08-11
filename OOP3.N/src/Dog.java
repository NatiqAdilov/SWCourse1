public class Dog extends Pet {
    private String size;

    public Dog(String name, int age, String size) {
        super(name, age);
        this.size = size;
    }

    @Override
    public void eat() {
        System.out.println("İtler yemek yeyir");
    }

    @Override
    public String description() {
        return getName() + ", " + getAge() + " yawinda bir " + size + " itdir";
    }
}
