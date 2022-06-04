package com.java.marathon.sprint07_NestedInnerClassesEnums.Question1;

class Pizza {
    private String cheese;
    private String meat;
    private String seafood;
    private String vegetable;
    private String mushroom;

    private Pizza() {
    }

    public static PizzaBuilder base() {
        return new PizzaBuilder();
    }

    public static class PizzaBuilder {
        Pizza pizza;

        private PizzaBuilder() {
            pizza = new Pizza();
        }

        public PizzaBuilder addCheese(String cheese) {
            this.pizza.cheese = cheese;
            return this;
        }

        public PizzaBuilder addMeat(String meat) {
            this.pizza.meat = meat;
            return this;
        }

        public PizzaBuilder addSeafood(String seafood) {
            this.pizza.seafood = seafood;
            return this;
        }

        public PizzaBuilder addVegetable(String vegetable) {
            this.pizza.vegetable = vegetable;
            return this;
        }

        public PizzaBuilder addMushroom(String mushroom) {
            this.pizza.mushroom = mushroom;
            return this;
        }

        public Pizza build() {
            return this.pizza;
        }
    }

}
