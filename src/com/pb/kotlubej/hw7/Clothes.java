package com.pb.kotlubej.hw7;

public abstract class Clothes {
    private Size size;
    private double price;
    private String color;

    public Clothes (Size size, double price, String color)
    {
        this.size = size;
        this.price = price;
        this.color = color;
    }
    public Size getSize() {
        size.getDescription(size);
        size.getEuroSize(size);
        return size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void dressMan()
    {};
    public void dressWoman()
    {};
}

