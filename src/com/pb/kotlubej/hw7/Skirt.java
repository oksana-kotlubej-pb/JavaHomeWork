package com.pb.kotlubej.hw7;
import com.pb.kotlubej.hw7.WomenClothes;

public class Skirt extends Clothes implements WomenClothes{
    public Skirt (Size size, double price, String color) {
        super(size, price, color);
    }
    public void dressWoman()
    {
        System.out.println(this.getSize() + " " + this.getColor() + " " + this.getPrice());
    }
}
