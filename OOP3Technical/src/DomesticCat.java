public class DomesticCat implements Pet {
    private String color;
    private int age;
    private String sex;
    public DomesticCat() {
        this.getAge();
        this.getSex();
        this.getColor();
    }
    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSex() {
        return sex;
    }
}
