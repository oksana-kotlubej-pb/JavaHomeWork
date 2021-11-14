package com.pb.kotlubej.hw7;
import com.pb.kotlubej.hw7.ManClothes;
import com.pb.kotlubej.hw7.WomenClothes;

public class Atelier  {
    public static void dressMan(Clothes[] clothes)
    {
        System.out.println("Man Clothes:");
        for (int i=0;i< clothes.length; i++)
        {
            if (clothes[i] instanceof ManClothes)
            {
               System.out.println(clothes[i].getClass().getSimpleName());
                clothes[i].dressMan();
            }
        }
    }
    public static void dressWoman(Clothes[] clothes)
    {
        System.out.println("Women Clothes:");
        for (int i=0;i< clothes.length; i++)
        {
            if (clothes[i] instanceof WomenClothes)
            {
                System.out.println(clothes[i].getClass().getSimpleName());
                clothes[i].dressWoman();
            }
        }
    }
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[]{
                new Tshirt(Size.XS, 9.99, "красный"),
                new Pants(Size.S, 29.99, "синий"),
                new Skirt(Size.L, 19.99, "коричневый"),
                new Tie(Size.M, 12.99, "зеленый")
        };
        dressMan(clothes);
        dressWoman(clothes);
    }
}
