package com.softserve.itacademy.sprint06.Question5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyUtils {
    public Map<String, Double> averageRating(List<Caffee> coffees) {
        int caffeeRating = 0;
        int cupRating = 0;
        int espressoRating = 0;
        Map<String, Double> average = new  HashMap<>();
        List<Caffee> caffee = coffees.stream().filter(o-> o.getClass().getSimpleName().equals("Caffee")).collect(Collectors.toList());
        List<Caffee> cappuccino = coffees.stream().filter(o-> o instanceof Cappuccino).collect(Collectors.toList());
        List<Caffee> espresso = coffees.stream().filter(o-> o instanceof Espresso).collect(Collectors.toList());
//        double coffeeAvarage = caffee.stream().mapToDouble(Caffee::getRating).average().orElse(0.00);
        for (Caffee caffee1 :caffee){
            caffeeRating += caffee1.getRating();
        }
        average.put(caffee.get(0).getName(), (double)caffeeRating/caffee.size());
        for (Caffee cupp :cappuccino){
            cupRating += cupp.getRating();
        }
        average.put(cappuccino.get(0).getName(), (double)cupRating/cappuccino.size());
        for (Caffee espress :espresso){
            espressoRating += espress.getRating();
        }
        average.put(espresso.get(0).getName(), (double)espressoRating/espresso.size());
        return average;
    }
}
