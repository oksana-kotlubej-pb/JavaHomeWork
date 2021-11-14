package com.pb.kotlubej.hw7;
import com.pb.kotlubej.hw7.ManClothes;

public class Tie extends Clothes implements ManClothes{
    public Tie (Size size, double price, String color) {
        super(size, price, color);
    }
    public void dressMan()
    {
        System.out.println(this.getSize() + " " + this.getColor() + " " + this.getPrice());
    }
}
