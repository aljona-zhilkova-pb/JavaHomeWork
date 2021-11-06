package com.pb.Zhilkova.hw6;

public class Dog extends Animal {

    String dogSound;
    int dogAge;
    String dogColor;

    public Dog(String food, String location, int dogAge, String dogColor, String dogSound) {

        this.food = "Meet";
        this.location = "Yard";
        this.dogSound = "Woof";
        this.dogAge = dogAge;
        this.dogColor = dogColor;

        @Override
        public void eat() {
            System.out.println("Dog eat: "  + food);
        }

        @Override
        public void makeNoise() {
            System.out.println("Dog say: " + dogSound);
        }
        @Override
        public void sleep(){
            System.out.println("Dog sleep.");
        }

        @Override
        public String toString() {
            return dogColor + "dog," + dogAge + "," + "eat-" + food + "," + "location:" + location + "came to the doctor.";
        }
        @Override
        public int hashCode() {
            return 20*dogColor.hashCode();
        }
        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Dog))
                return false;
            Dog d = (Dog) obj;
            return (this.dogColor.equals(d.dogColor) && this.dogAge==d.dogAge);
        }

    }
}



