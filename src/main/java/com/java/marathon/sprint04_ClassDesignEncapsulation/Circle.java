package com.java.marathon.sprint04_ClassDesignEncapsulation;

// Question 4
// Create a new version of the Circle class where the draw method will be overloaded three times:
//        Using the one parameter color of String type.
//        Using the one parameter scale of float type.
//        Using two parameters color and scale of String and float type.

public class Circle {
    private double radius;
    public String color;
    public float scale;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {

    }

    public void draw(String color) {

    }

    public void draw(float scale) {

    }

    public void draw(String color, float scale) {

    }
}
