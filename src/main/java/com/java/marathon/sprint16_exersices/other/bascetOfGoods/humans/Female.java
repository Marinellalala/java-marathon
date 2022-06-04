package com.java.marathon.sprint16_exersices.other.bascetOfGoods.humans;

import java.util.Random;
import java.util.Scanner;

public class Female extends Human{
    public Human bornChild(Human human){
        boolean isMale = new Random().nextBoolean();
        Human child;
        if (!isMale){
            System.out.println("У вас родилдась девочка!");
            child = new Female();
        } else {
            System.out.println("У вас родился мальчик");
            child = new Male();
        }
        System.out.println("Введите имя");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String surname = human.getSurname();

        float height = (float) (isMale ? Math.abs(human.getHeight() + 0.1*(this.getHeight()-human.getHeight())) :
                Math.abs(this.getHeight() + 0.1*(human.getHeight()-this.getHeight())));

        float weight = (float) (isMale ? Math.abs(human.getWeight() + 0.1*(this.getWeight()-human.getWeight())) :
                Math.abs(this.getWeight() + 0.1*(human.getWeight()-this.getWeight())));

        child.setName(name);
        child.setSurname(surname);
        child.setHeight(height);
        child.setWeight(weight);
        return child;
    }

    public Female(String name, String surname, int height, int weight) {
        super(false, name, surname, height, weight);
    }

    public Female() {
        super(false, "Kate", "Parry", 50, 160);
    }
}
