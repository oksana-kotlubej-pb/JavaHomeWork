package com.pb.kotlubej.hw6;
public class VetClinic {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat("Кот", "Рыба", "Дом", 10);
        Dog dog = new Dog ("Собака", "Мясо", "Будка", "Такса");
        Horse horse = new Horse("Лошадь","Сено","Конюшня", 80.05);
        Animal[] animals = new Animal[]{cat,dog,horse};
        Veterinarian vetDoctor = new Veterinarian();
        System.out.println("Все животные");
        for (int i = 0; i<animals.length; i++) {
           System.out.println(animals[i].getAnimal()+" " +animals[i].getFood()+" " +animals[i].getLocation());
           animals[i].sleep();
           animals[i].eat();
           animals[i].makeNoise();
        }
        for (int i=0;i<animals.length;i++)
        {
          vetDoctor.treatAnimal(animals[i]);
        }

    }
}
