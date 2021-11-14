package com.pb.kotlubej.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {

    public Tshirt(Size size, double price, String color) {
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
