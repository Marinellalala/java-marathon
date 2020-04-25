package com.softserve.itacademy.sprint06.Question3;

public class Rectang extends Square{
    private double height;

    public Rectang(double height, double width) {
        super(width);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (getHeight() + getWidth());
    }
}
