package com.pb.Zhilkova.hw7;

public class Atelier {

    public static void main(String[] args) {

        Tshirt tshirt1 = new Tshirt(Size.S,25,"white");
        Tshirt tshirt2 = new Tshirt(Size.L, 38, "black");
        Tshirt tshirt3 = new Tshirt(Size.M, 42, "red");
        Tshirt tshirt4 = new Tshirt(Size.XXS, 18, "pink");
        Tshirt tshirt5 = new Tshirt(Size.XS, 22, "yellow");
        Pants pants6 = new Pants(Size.XXS, 20, "pink");
        Pants pants7 = new Pants(Size.XS, 22, "yellow");
        Pants pants8 = new Pants(Size.S, 24, "white");
        Pants pants9 = new Pants(Size.M, 26, "red");
        Pants pants10 = new Pants(Size.L, 28, "black");
        Skirt skirt11 = new Skirt(Size.XXS, 30, "striped");
        Skirt skirt12 = new Skirt(Size.XS, 34, "leopard");
        Skirt skirt13 = new Skirt(Size.S, 36, "orange");
        Skirt skirt14 = new Skirt(Size.M, 40, "gray");
        Skirt skirt15 = new Skirt(Size.L, 44, "brown");
        Tie tie16 = new Tie(Size.XXS, 12, "green");
        Tie tie17 = new Tie(Size.L, 20, "blue");

        Clothes[] clothes = {tshirt1, tshirt2, tshirt3, tshirt4, tshirt5, pants6, pants7, pants8, pants9, pants10,
                skirt11, skirt12, skirt13, skirt14, skirt15, tie16, tie17};

        System.out.println("Clothes for women: ");
        dressWomen(clothes);

        System.out.println("Clothes for man: ");
        dressMan(clothes);
    }
    static void dressWomen(Clothes[] clothes) {
        for (Clothes x : clothes) {
            if (x instanceof WomenClothes){
                ((WomenClothes) x).dressWomen();
            }
        }
    }

    static void dressMan(Clothes[] clothes) {
        for (Clothes x : clothes) {
            if (x instanceof ManClothes) {
                ((ManClothes) x).dressMan();
            }
        }
    }
}
