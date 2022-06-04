package com.java.marathon.sprint16_exersices.other.animals;

public class House {
     /*
1. Создать класс Cat в котором будут переменные name и age.
2. Создать класс Dog в котором будут переменные name и age.
3. Создать класс House в котором будут жить 3 кошки и 2 собаки.(с разными именами и возрастом)
4. Вывести для кождой собаки и кошки строку
Пример: Тузик лает. Ему 3 года
Мурзик мяукает. Ему 5 лет
Звери не могут быть старше 15 лет
*/

    public static void main(String[] args) {

        Pet vasja = new Cat("Vasja", 40);
        Pet murzik = new Cat("Murzik", 5);
        Pet murka = new Cat("Murka", 4);
        Pet tuzik = new Dog("Tuzik", 11);
        Pet bobik = new Dog("Bobik", 7);


//        Cat vasja = new Cat();
//        vasja.setName("Vasja");
//        vasja.setAge(16);
//        vasja.voice();
//
//        Cat murzik = new Cat();
//        murzik.setName("Murzik");
//        murzik.setAge(1);
//        murzik.voice();
//
//        Cat murka = new Cat();
//        murka.setName("Murka");
//        murka.setAge(4);
//        murka.voice();
//
//        Dog tuzik = new Dog();
//        tuzik.setName("Tuzik");
//        tuzik.setAge(2);
//        tuzik.bark();
//
//        Dog bobik = new Dog();
//        bobik.setName("Bobik");
//        bobik.setAge(1);
//        bobik.bark();



//        Cat vasja = new Cat("Vasja", 3);
//        Cat murzik = new Cat("Murzic", 1);
//        Cat murka = new Cat("Murke", 4);
//        Dog tuzik = new Dog("Tuzik", 2);
//        Dog bobik = new Dog("Bobik", 1);
//        vasja.voice();
//        murzik.voice();
//        murka.voice();
//        tuzik.bark();
//        bobik.bark();

    }
}
