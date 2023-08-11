public class Pet {
    public String color;
    public int age;
    public String sex;
    public Pet(String color, int age, String sex){
        this.color=color;
        this.age=age;
        this.sex=sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
