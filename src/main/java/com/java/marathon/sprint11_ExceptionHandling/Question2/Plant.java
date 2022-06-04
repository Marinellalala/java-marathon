package com.java.marathon.sprint11_ExceptionHandling.Question2;

//Create a class Plant, which includes private fields String name, Color color and Type type, and constructor with three String parameters where these fields are initialized. Color and Type are Enum.
//        Color contains White, Red, Blue entries.
//        Type contains Rare and Ordinary entries.
//        Override the method toString( ) for Plant class which returns result formatted like following: {type: Rare, color: Red, name: MyPlant}
//        Create classes ColorException and TypeException as derived from Exception. Both classes should have a constructor with one String parameter and pass this parameter to the base class.
//        The constructor of Plant should throw a corresponding exception whenever an inappropriate parameter is passed.

public class Plant {
    private String name;
    private Color color;
    private Type type;

    public Plant(String type, String color, String name) throws ColorException, TypeException {
        this.name = name;
        this.color = Color.getColorByName(color);
        this.type = Type.getTypeByString(type);
    }

    @Override
    public String toString() {
        return "{type: " + type + ", color: " + color + ", name: " + name+"}";
    }

    public static void main(String[] args) throws TypeException, ColorException {
        Plant plant = new Plant("flower", "White", "Rare");
        System.out.println(plant.toString());
        plant = new Plant("flower", "White", "MyPlant");
        System.out.println(plant.toString());
    }
}
