package com.java.marathon.sprint16_exersices.other.bascetOfGoods.products;

public class Clothes extends Product {
    private String size;
    private String colour;
    private int height;
    private int weight;

    public Clothes() {
        super();
        size = "M";
        colour = "blue";
        height = 170;
        weight = 52;
    }

    public Clothes(String name, int price, String size, String colour, int height, int weight) {
        super(name, price);
        this.size = size;
        this.colour = colour;
        this.height = height;
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }


    public void setSize(String size) {
        this.size = size;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Set age greater than 0");
        }
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                "} " + super.toString();
    }
}
