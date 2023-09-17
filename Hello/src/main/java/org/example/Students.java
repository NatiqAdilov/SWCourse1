package org.example;

public class Students {
    String surname;
    String name;
    String age;
    String GroupNum;

    public Students(String surname, String name, String age, String groupNum) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        GroupNum = groupNum;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGroupNum() {
        return GroupNum;
    }

    public void setGroupNum(String groupNum) {
        GroupNum = groupNum;
    }
}
