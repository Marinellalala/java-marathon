package com.softserve.itacademy.sprint07.Question1;

class Oven {
    public static Pizza cook() {
        Pizza pizza = Pizza.base().addCheese("cheese").addVegetable("tomato").addMushroom("mushrooms").addMeat("meat").addSeafood("seafood").build();
        return pizza;
    }
}
