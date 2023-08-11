public abstract class Pet {
        String sex;
        String color;

    public Pet(String sex, String color) {
        this.sex = sex;
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
