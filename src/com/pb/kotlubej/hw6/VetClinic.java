package com.pb.kotlubej.hw6;

import java.lang.reflect.Constructor;

public class VetClinic {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat("Кот", "Рыба", "Дом", 10);
        Dog dog = new Dog("Собака", "Мясо", "Будка", "Такса");
        Horse horse = new Horse("Лошадь", "Сено", "Конюшня", 80.05);
        Animal[] animals = new Animal[]{cat, dog, horse};
        Veterinarian vetDoctor = new Veterinarian();
        System.out.println("Все животные");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getAnimal() + " " + animals[i].getFood() + " " + animals[i].getLocation());
            animals[i].sleep();
            animals[i].eat();
            animals[i].makeNoise();
        }
        for (int i = 0; i < animals.length; i++) {
            vetDoctor.treatAnimal(animals[i]);
        }
        Cat cat1 = new Cat("кот", "рыба", "дом", 5);
        Cat cat2 = new Cat("кот", "молоко", "дом", 1);
        Cat cat3 = new Cat("кот", "рыба", "дом", 5);

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);

        System.out.println("eq cat1 cat3: " + cat1.equals(cat3));
        System.out.println("eq cat1 cat2: " + cat1.equals(cat2));

        System.out.println("hashCode 1: " + cat1.hashCode());
        System.out.println("hashCode 2: " + cat2.hashCode());
        System.out.println("hashCode 3: " + cat3.hashCode());

        Class vetClass = Class.forName("com.pb.kotlubej.hw6.Veterinarian");
       Constructor construct = vetClass.getConstructor(new Class[] {});
       Object obj = construct.newInstance();
       if (obj instanceof Veterinarian)
       {
           ((Veterinarian) obj).on();
       }

    }
}

