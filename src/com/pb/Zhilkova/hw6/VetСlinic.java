package com.pb.Zhilkova.hw6;


public class VetСlinic {
    public static void main(String[] args) {

        Animal animal1 = new Dog("Meet", "Yard", 8, "black red", "Woof");
        Animal animal2 = new Cat("Dry food", "Coach", 6, "grey", "Meow");
        Animal animal3 = new Horse("Hay", "Barn", 2, "white", "Neigh");
        Animal[] animals = {animal1, animal2, animal3};
        for (Animal x: animals) {
            System.out.println(x.toString());
            //System.out.println(x.hashCode());
            x.eat();
            x.sleep();
            x.makeNoise();
        }
        //рефлексия
        Veterinarian veterinarian = null;
        try {
            Class clazz = Class.forName(Veterinarian.class.getName());
            veterinarian = (Veterinarian) clazz.newInstance();

        }   catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }


        /*Class clazz = Class.forName(Veterinarian.class.getName());
        Object obj = clazz.getConstructor("Ветеренар");
        if (obj instanceof Veterinarian) {
            Veterinarian veterinarian;
            for (Animal x : animals)
                veterinarian.treatAnimal(x);
        }*/
    }
}
