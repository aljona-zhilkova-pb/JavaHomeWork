package com.pb.Zhilkova.hw7;

import com.sun.glass.ui.Size;

public class Pants extends Clothes implements WomenClothes, ManClothes {

    String gender;

    Pants(Size size, int price, String color) {
        super(size, price, color);
    }
        @Override
            public void dressMan() {
            System.out.println("Pants - " + clothesSize + "(" + clothesSize.getEuroSize() + ")" + clothesSize.getDescription()
                    + "," + "price - " + price + "$" + "," + "color - " + color);
        }
        @Override
            public void dressWomen() {
                System.out.println("Pants - " + clothesSize + "(" + clothesSize.getEuroSize() + ")" + clothesSize.getDescription()
                        + "," + "price - " + price + "$" + "," + "color - " + color);
        }
}

