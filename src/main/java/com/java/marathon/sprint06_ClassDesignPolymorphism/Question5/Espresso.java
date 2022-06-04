package com.java.marathon.sprint06_ClassDesignPolymorphism.Question5;

import java.util.HashMap;
import java.util.Map;

public class Espresso extends Caffee {


    public Espresso(String name, int rating) {
        super(ESPRESSO, rating);
    }

    @Override
    public Map<String, Integer> makeDrink() {
        Map<String, Integer> caffee = new HashMap<>();
        caffee.put("Water", 50);
        caffee.put("Arabica", 20);
        return caffee;
    }
}
