package com.java.marathon.sprint06_ClassDesignPolymorphism.Question4;

class Circle extends Shape{

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    @Override
    public double getArea() {
        return radius * radius;
    }
}
