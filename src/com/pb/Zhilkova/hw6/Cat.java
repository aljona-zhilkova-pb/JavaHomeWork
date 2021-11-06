package com.pb.Zhilkova.hw6;

public class Cat extends Animal {

    String catSound;
    int catAge;
    String catColor;

    public Cat(String food, String location, int catAge, String catColor, String catSound) {
        this.food = "Dry food";
        this.location = "Coach";
        this.catSound = "Meow";
        this.catAge = catAge;
        this.catColor = catColor;

        @Override
        public void eat() {
            System.out.println("Cat eat: " + food);
        }

        @Override
        public void makeNoise() {
            System.out.println("Cat say: " + catSound);
        }
        @Override
        public void sleep() {
            // for ()
            System.out.println("Cat sleep.");
        }

        @Override
        public String toString() {
            return catColor + "cat," + catAge + "," + "eat-" + food + "," + "location:" + location + "came to the doctor's appointment.";
        }
        @Override
        public int hashCode() {
            return 20 * catColor.hashCode();
        }
        @Override
        public boolean equals (Object obj){
            if (!(obj instanceof Dog))
                return false;
            Cat c = (Cat) obj;
            return (this.catColor.equals(c.catColor) && this.catAge == c.catAge);
        }
    }
}

