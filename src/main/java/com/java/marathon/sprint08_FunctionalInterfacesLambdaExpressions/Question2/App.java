package com.java.marathon.sprint08_FunctionalInterfacesLambdaExpressions.Question2;

// Please, create a static Consumer implementation cons that takes an array
// of doubles as a parameter and changes it using the next rule: all values
// that are greater than 2 should be multiplied by 0.8, and other values should
// be multiplied by 0.9.
//
// Also, please. implement a static method getChanged that takes an array of doubles
// as a first parameter and  Consumer as a second. The method should return an array
// changed by the second parameter.
//
// getChanged method should not change initial array.

import java.util.Arrays;
import java.util.function.Consumer;

public class App {

    public static double[] getChanged(double[] initialArray, Consumer<double[]> cons) {
        double[] resArray = Arrays.copyOf(initialArray, initialArray.length);
        cons.accept(resArray);
        return resArray;
    }

    static Consumer<double[]> cons = new Consumer<double[]>() {
        @Override
        public void accept(double[] aDouble) {
            for (int i = 0; i < aDouble.length; i++) {
                if ( aDouble[i] > 2) {
                    aDouble[i] *= 0.8;
                } else {
                    aDouble[i] *=0.9;
                }
            }
        }
    };


//    public static double[] getChanged(double[] initialArray, Consumer<Double> cons) {
//        // Code
//        double[] resArray = initialArray;
//        for (double i: resArray){
//            if(i>2){
//                cons.accept(i*0.8);
//            } else {
//                cons.accept(i*0.9);
//            }
//        }
//        return resArray;
//    }
}
