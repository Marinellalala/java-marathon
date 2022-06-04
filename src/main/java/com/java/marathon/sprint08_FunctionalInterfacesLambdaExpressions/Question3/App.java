package com.java.marathon.sprint08_FunctionalInterfacesLambdaExpressions.Question3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class App {

    public static List<String> createGreetings(List<Person> people, BinaryOperator<String> msg){
        List<String> greeting = new ArrayList<>();
        for (Person p: people){
            greeting.add(msg.apply(p.name, p.surname));
        }
        return greeting;
    }

    static BinaryOperator<String> greetingOperator = new BinaryOperator<String>() {
        @Override
        public String apply(String s, String s2) {
            return "Hello " + s + " " + s2 + "!!!";
        }
    };

}
