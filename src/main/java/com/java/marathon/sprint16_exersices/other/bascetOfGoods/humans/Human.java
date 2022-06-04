package com.java.marathon.sprint16_exersices.other.bascetOfGoods.humans;

import java.util.Random;

public abstract class Human {
    private boolean isMale;
    private String name;
    private String surname;
    private float height;
    private float weight;

    public Human() {
    }

    public Human(boolean isMale, String name, String surname, int height, int weight) {
        this.isMale = isMale;
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }


    private boolean talk(Human human) {
        boolean isTalk = false;
        if (this instanceof Female && human instanceof Female) {
            isTalk = true;
        } else if (this instanceof Female && human instanceof Male) {
            isTalk = true;
        } else if (this instanceof Male && human instanceof Female) {
            isTalk = true;
        } else if (this instanceof Male && human instanceof Male) {
            isTalk = new Random().nextInt(10) < 5;
        }
        System.out.println("Разговаривают " + isTalk);
        return isTalk;
    }

    private boolean endure(Human human) {
        boolean isEndure = false;
        if (this instanceof Female && human instanceof Female) {
            isEndure = new Random().nextInt(100) < 5;
        } else if (this instanceof Female && human instanceof Male) {
            isEndure = new Random().nextInt(100) < 70;
        } else if (this instanceof Male && human instanceof Female) {
            isEndure = new Random().nextInt(100) < 70;
        } else if (this instanceof Male && human instanceof Male) {
            isEndure = new Random().nextInt(100) < 5.6;
        }
        System.out.println("Терпят друг друга " + isEndure);
        return isEndure;
    }

    private boolean spendTime(Human human) {
        boolean isSpendTime = false;
        float height1 = this.getHeight();
        float height2 = human.getHeight();
        float dif = (height2 / height1 < 1 ? 1 - height2 / height1 : 1 - height1 / height2) * 100;
        isSpendTime = dif > 10 ? new Random().nextInt(100) < 85 : new Random().nextInt(100) < 95;
        System.out.println("Проводят время вместе " + isSpendTime);
        return isSpendTime;
    }

    public Human hasRelations(Human human) {
        Human child = null;
        if (this.talk(human) && this.endure(human) && this.spendTime(human)) {
            if (this.isMale != human.isMale) {
                child = this instanceof Female ? ((Female) this).bornChild(human) : ((Female) human).bornChild(this);
            }
        }
        return child;
    }

    public boolean isMale() {
        return isMale;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "isMale=" + isMale +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
