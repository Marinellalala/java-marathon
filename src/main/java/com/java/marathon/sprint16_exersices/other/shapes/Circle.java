package com.java.marathon.sprint16_exersices.other.shapes;

public class Circle extends Shape {
    int x, y,r;

    public Circle(String color, int x, int y, int r) {
        super(color);
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public String draw() {
        return "Circle";
    }
}
