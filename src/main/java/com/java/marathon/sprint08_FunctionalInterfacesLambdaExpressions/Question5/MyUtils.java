package com.java.marathon.sprint08_FunctionalInterfacesLambdaExpressions.Question5;

// Please, implement a static method getPredicateFromSet in MyUtils class.
//
// getPredicateFromSet should take a Set of predicates working with integers
// as a parameter and return a predicate with the functionality of all predicates
// in the set invoked and connected by logical AND.

import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

public class MyUtils {

    static Predicate<Integer> getPredicateFromSet(Set<Predicate<Integer>> predicateSet) {
        Iterator<Predicate<Integer>> iterator = predicateSet.iterator();
        Predicate<Integer> predicate = iterator.next();
        while (iterator.hasNext()) {
            predicate = predicate.and(iterator.next());
        }
        return predicate;
    }
}

