package com.pb.kotlubej.hw6;

public class Veterinarian {
    static {
        System.out.println("Veterinarian initializing");
    }
public static void treatAnimal(Animal animal) {
        System.out.println(animal.getFood() + " " + animal.getLocation());
    }
}
