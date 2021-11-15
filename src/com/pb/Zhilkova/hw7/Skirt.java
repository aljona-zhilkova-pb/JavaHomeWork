package com.pb.Zhilkova.hw7;

public class Skirt extends Clothes implements WomenClothes {

    Skirt(Size size, int price, String color){
        super(size, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Skirt -" + clothesSize + "(" + clothesSize.getDescription + ")" + clothesSize.getEuroSize()
                + "," + "price - " + price + "$" + "," + "color - " + color);
    }
}
