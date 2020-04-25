package com.softserve.itacademy.sprint08.Question4;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    public List<DecisionMethod> clients = new ArrayList<>();

    public int sale(String product, int percent){
        int count = 0;
        for (DecisionMethod client: clients){
           if(client.decide(product, percent)) {
               count++;
           }
        }
        return count;
    }
}
