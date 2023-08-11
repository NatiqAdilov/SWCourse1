public class Dog implements Pet {
    private String color;
    private int age;
    private String sex;
    public Dog() {
        this.getSex();
        this.getAge();
        this.getColor();
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public int getAge() {
        return age;
    }
}
