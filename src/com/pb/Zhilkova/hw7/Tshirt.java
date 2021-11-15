package com.pb.Zhilkova.hw7;

public class Tshirt extends Clothes implements WomenClothes, ManClothes {

    String gender;

    Tshirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Tshirt -" + clothesSize + "(" + clothesSize.getEuroSize() + ")" + clothesSize.getDescription()
                + "," + "price - " + price + "$" + "," + "color - " + color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Tshirt -" + clothesSize + "(" + clothesSize.getEuroSize() + ")" + clothesSize.getDescription()
                + "," + "price - " + price + "$" + "," + "color - " + color);
    }
}
