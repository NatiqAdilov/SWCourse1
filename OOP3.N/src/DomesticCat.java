public class DomesticCat extends Pet {
    private String breed;

    public DomesticCat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println("Ev heyvanları yemək yeyir");
    }

    @Override
    public String description() {
        return getName() + ", " + getAge() + " yaşında bir " + breed + " pişikdir";
    }
}
