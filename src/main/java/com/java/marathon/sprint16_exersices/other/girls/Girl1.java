package com.java.marathon.sprint16_exersices.other.girls;

public class Girl1 {
    private String name;
    private int age;

    public Girl1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String goToRest(String mac) {
        if("Mac".equals(mac)){
            return "No";
        } else {
            return "Yes";
        }
    }

    public void goToCinema() {
        System.out.println("Go go go!!" + name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>18 && age<40)
            this.age = age;
    }
}
