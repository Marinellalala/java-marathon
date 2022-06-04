package com.java.marathon.sprint16_exersices.other.bascetOfGoods.humans;

public class Male extends Human {
    public Male(String name, String surname, int height, int weight, boolean isMale1) {
        super(true, name, surname, height, weight);
    }

    public Male() {
        super(true, "Tom", "Brown", 60, 180);
    }
}
