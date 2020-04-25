package com.softserve.itacademy.sprint08.Question6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class User {

    public final List<Integer> values = new ArrayList<Integer>();

    int getFilterdValue(BiFunction<List<Integer>, Predicate<Integer>, Integer> myUtils, Predicate<Integer> pr){
        //implementation
        return myUtils.apply(values, pr);
    }

    int getMaxValueByCondition(Predicate<Integer> pr) {
        return getFilterdValue(MyUtils::findMaxByCondition, pr);
    }
}
