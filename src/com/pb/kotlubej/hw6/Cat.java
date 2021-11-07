package com.pb.kotlubej.hw6;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "возраст " + age +
                '}';
    }
}

