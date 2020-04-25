package com.softserve.itacademy.sprint05;



public class App{

    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal anim =  dog;
        anim.eat();

        Animal anim1 = new Cat();
        Cat cat = (Cat) anim1;
        cat.eat();

        ACar carX6 = new BmwX6();
        ACar carX6mod = new BmwX6mod();
        BmwX6 carX6mod2 = new BmwX6mod();
        //
        carX6.carRides();
        ((BmwX6) carX6).lightsShine();
        //
        carX6mod.carRides();
        ((BmwX6) carX6mod).lightsShine();
        //
        carX6mod2.carRides();
        carX6mod2.lightsShine();

    }
}
