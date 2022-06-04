package com.java.marathon.sprint07_NestedInnerClassesEnums.Question1;

class Oven {
    public static Pizza cook() {
        Pizza pizza = Pizza.base().addCheese("cheese").addVegetable("tomato").addMushroom("mushrooms").addMeat("meat").addSeafood("seafood").build();
        return pizza;
    }
}
