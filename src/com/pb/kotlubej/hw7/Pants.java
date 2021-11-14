package com.pb.kotlubej.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes {
    public Pants (Size size, double price, String color){
        super(size, price, color);
    }
    public void dressWoman()
    {
        System.out.println(this.getSize() + " " + this.getColor() + " " + this.getPrice());
    }
    public void dressMan()
    {
        System.out.println(this.getSize() + " " + this.getColor() + " " + this.getPrice());
    }
}
