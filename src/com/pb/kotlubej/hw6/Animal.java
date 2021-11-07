package com.pb.kotlubej.hw6;

public class Animal {

    private String animal;
    private String food;
    private String location;

    public Animal (String animal, String food, String location) {
        this.animal = animal;
        this.food = food;
        this.location = location;
    }


    public String getAnimal() {
        return animal;
    }
    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise (){
        System.out.println(animal + " сопит");
    }
    public void eat(){
        System.out.println(animal + " ест");
    }
    public void sleep(){
        System.out.println(animal + " спит");
    }
}
