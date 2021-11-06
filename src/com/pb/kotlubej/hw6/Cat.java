package com.pb.kotlubej.hw6;

public class Cat extends Animal{
    private int age;

    public Cat(String animal, String food, String location, int age) {
        super(animal, food, location);
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int animal) {
        this.age = age;
    }
    @Override
    public void makeNoise (){
        System.out.println(getAnimal() + " постоянно сопит");
        super.makeNoise();
    }
    public void eat(){
        System.out.println(getAnimal() + " постоянно ест");
        super.eat();
    }
    public void sleep(){
        System.out.println(getAnimal() + " постоянно спит");
        super.sleep();
    }
}
