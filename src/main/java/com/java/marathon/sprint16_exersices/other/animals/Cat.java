package com.java.marathon.sprint16_exersices.other.animals;

public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name,age);
    }

    @Override
    public void voice() {
        System.out.println(getName()+ "is mjaykaet."+ " He is "+ getAge() + " years old.");
    }

}
