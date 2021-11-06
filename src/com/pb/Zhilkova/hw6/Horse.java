package com.pb.Zhilkova.hw6;

public class Horse extends Animal {

    String horseSound;
    int horseAge;
    String horseColor;

    public Horse(String food, String location, int horseAge, String horseColor,String horseSound) {

        this.food = "Hay";
        this.location = "Barn";
        this.horseSound = "Neigh";
        this.horseAge = horseAge;
        this.horseColor = horseColor;

    @Override
    public void eat() {
        System.out.println("Horse eat: " + food);
    }

    @Override
    public void makeNoise() {
        System.out.println("Horse say: " + horseSound);
    }
    @Override
    public void sleep() {
            // for ()
         System.out.println("Horse sleep.");
    }
    @Override
    public String toString() {
        return horseColor + "horse," + horseAge + "," + "eat-" + food + "," + "location:" + location);
    }

    @Override
    public int hashCode() {
        return 20*horseColor.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
            if (!(obj instanceof Horse))
                return false;
            Horse h = (Horse) obj;
            return (this.horseColor.equals(h.horseColor) && this.horseAge==h.horseAge);
     }
   }
}
