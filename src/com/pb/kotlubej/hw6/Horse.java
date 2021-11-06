package com.pb.kotlubej.hw6;

public class Horse extends Animal{
    private double speed;
    public Horse(String animal, String food, String location, double speed) {
        super(animal, food, location);
        this.speed = speed;
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    @Override
    public void makeNoise (){
        super.makeNoise();
        System.out.println (getAnimal() + " громко сопит");
    }
    public void eat(){
        super.eat();
        System.out.println(getAnimal() + " громко ест");
    }
    public void sleep(){
        super.sleep();
        System.out.println(getAnimal() + " громко спит");
    }
}
