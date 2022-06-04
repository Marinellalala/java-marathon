package com.java.marathon.sprint06_ClassDesignPolymorphism.Question5;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Caffee implements DrinkReceipt, DrinkPreparation, Rating{
    public static final String WATER = "Water";
    public static final String ARABICA = "Arabica";
    public static final String ESPRESSO = "Espresso";
    public static final String CAPPUCCINO = "Cappuccino";
    public static final String CAFFEE = "CAFFEE";
    private String name;
    private int rating;
    Map<String, Integer> ingredients;

    @Override
    public String toString() {
        return "Caffee{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Caffee caffee = (Caffee) o;
        return rating == caffee.rating &&
                Objects.equals(name, caffee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating);
    }

    public Caffee(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setIngredients(Map<String, Integer> ingredients) {
        this.ingredients = ingredients;
    }

    public Map<String, Integer> getIngredients() {
        return ingredients;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public Map<String, Integer> makeDrink() {
        ingredients = new HashMap<>();
        ingredients.put(WATER, 100);
        ingredients.put(ARABICA, 20);
        return ingredients;
    }

    @Override
    public DrinkReceipt addComponent(String componentName, int componentCount) {
        DrinkReceipt receipt = new Caffee(componentName, componentCount);
        return receipt;
    }


}
