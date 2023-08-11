public class Robocat extends Pet {
    private String model;

    public Robocat(String name, int age, String model) {
        super(name, age);
        this.model = model;
    }

    @Override
    public void eat() {
        System.out.println("Robot piwikler yemek yeyir");
    }

    @Override
    public String description() {
        return getName() + ", " + getAge() + " yawinda bir " + model + " piwik robotudur";
    }
}
