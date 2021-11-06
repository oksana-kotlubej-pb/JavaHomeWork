package com.pb.kotlubej.hw6;

public class Dog extends Animal {
    private String breed;

    public Dog(String animal, String food, String location, String breed) {
        super(animal, food, location);
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String animal) {
        this.breed = breed;
    }
    @Override
    public void makeNoise (){
        System.out.println (getAnimal() + " тихо сопит");
        super.makeNoise();
    }
    public void eat(){
        System.out.println(getAnimal() + " тихо ест");
        super.eat();
    }
    public void sleep(){
        System.out.println(getAnimal() + " тихо спит");
        super.sleep();
    }
}
