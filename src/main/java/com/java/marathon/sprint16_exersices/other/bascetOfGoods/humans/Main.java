package com.java.marathon.sprint16_exersices.other.bascetOfGoods.humans;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human p1;
        Human p2;

        Human[] pair = createPiarFromUserChoice(readUserInput());
        p1 = pair[0];
        p2 = pair[1];

        printResult(p2.hasRelations(p1));
    }

    private static void printResult(Human child){
        if (child != null) {
            System.out.println("Параметры ребенока " + child);
        } else {
            System.out.println("ничего не вышло... разбежались");
        }

    }

    private static int readUserInput() {
        System.out.println("Choose one from the following  combinations of the humankind:" +
                "\n1. Male-Female" +
                "\n2. Female-Male" +
                "\n3. Male-Male" +
                "\n4. Female-Female");
        String scan = null;
        try {
            scan = new Scanner(System.in).next("[1-4]");
        } catch (InputMismatchException e) {
            System.out.println("Input is not a number from 1..4.\n Try again");
            readUserInput();
        }
        return Integer.valueOf(scan);
    }

    private static Human[] createPiarFromUserChoice(int chosenNumber) {
        Human[] pair = new Human[2];
        Male male = new Male();
        Female female = new Female();
        switch (chosenNumber) {
            case 1:
                pair[0] = male;
                pair[1] = female;
                break;
            case 2:
                pair[0] = female;
                pair[1] = male;
                break;
            case 3:
                pair[0] = male;
                pair[1] = male;
                break;
            case 4:
                pair[0] = female;
                pair[1] = female;
                break;
        }
        return pair;
    }
}
