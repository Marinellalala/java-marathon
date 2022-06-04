package com.java.marathon.sprint16_exersices.other.bascetOfGoods.products;

public class Cosmetics extends Product {
    private String type;
    private String gender;
    private int age;

    public Cosmetics() {
        super();
        this.type = "lipBalm";
        this.gender = "female";
        this.age = 18;
    }

    public Cosmetics(String name, int price, String type, String gender, int age) {
        super(name, price);
        this.type = type;
        this.gender = gender;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public String getGender() {
        return gender;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Set age greater than 0");
        }
    }

    @Override
    public String toString() {
        return "Cosmetics{" +
                "type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                "} " + super.toString();
    }
}
