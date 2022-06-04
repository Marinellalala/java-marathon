package com.java.marathon.sprint16_exersices.other.shapes;

public class Rectangle extends Shape  {
    int x,y,z,w;

    public Rectangle(String color, int x, int y, int z, int w) {
        super(color);
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    @Override
    public String draw() {
        return "Rectangle";
    }
}
