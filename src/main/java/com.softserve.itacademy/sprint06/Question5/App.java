package com.softserve.itacademy.sprint06.Question5;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Caffee> caffees = new ArrayList<>();
        caffees.add(new Espresso("Espresso", 8));
        caffees.add(new Cappuccino("Cappuccino", 10));
        caffees.add(new Espresso("Espresso", 10));
        caffees.add(new Cappuccino("Cappuccino", 6));
        caffees.add(new Caffee("Caffee", 6));
        MyUtils myUtils = new MyUtils();
        System.out.println(myUtils.averageRating(caffees));
    }
}
