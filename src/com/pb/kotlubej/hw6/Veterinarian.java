package com.pb.kotlubej.hw6;

public class Veterinarian {
    public Veterinarian() {
        System.out.println( "Объект класса Veterinarian создан!");
    }
    public static void treatAnimal(Animal animal) {
        System.out.println(animal.getFood() + " " + animal.getLocation());
    }
    public void on() {
        System.out.println( "Я ваш ветеринар сегодня!");
    }
}
