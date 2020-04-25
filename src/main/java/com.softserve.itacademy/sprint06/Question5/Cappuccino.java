package com.softserve.itacademy.sprint06.Question5;

import java.util.HashMap;
import java.util.Map;

public class Cappuccino extends Caffee {

    public Cappuccino(String name, int rating) {
        super(CAPPUCCINO, rating);
    }

    @Override
    public Map<String, Integer> makeDrink() {
        Map<String, Integer> caffee = new HashMap<>();
        caffee.put("Water", 50);
        caffee.put("Arabica", 20);
        caffee.put("Milk", 50);
        return caffee;
    }
}
