package com.softserve.itacademy.sprint12.Question3;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Interactor {
    int x;

    public synchronized void serve(UnaryOperator<Integer> uo, int initializer) throws InterruptedException {
        System.out.println("Serving thread running");
        System.out.println("Serving thread initializes the key");
        x = uo.apply(initializer);
        System.out.println("key = " + x);
        notify();
        wait();
        System.out.println("Serving thread resumed");

    }

    public synchronized void consume(BinaryOperator<Integer> bo, int operand2) throws InterruptedException {
        if (x == 0) {
            try {
                wait(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consuming thread received the key. key = " + x);
        x = bo.apply(x, operand2);
        System.out.println("Consuming thread changed the key. key = " + x);
        notify();
    }
}
