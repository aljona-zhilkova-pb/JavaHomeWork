package com.pb.Zhilkova.hw11;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SerialMain {
    public static void main(String[] args)  throws Exception {

        File file = Paths.get("person.data").toFile();
        FileOutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        Person person1 = new Person("Sergey", "0955250816", "str.Lenina 3",
                LocalDate.of(1992, 5, 21), LocalDateTime.now());
        Person person2 = new Person("Uliana", "0689251618", "str.Karazina 5",
                LocalDate.of(2008, 2, 23), LocalDateTime.now());
        Person person3 = new Person("Yrij", "0939825656", "str.Petrovskogo 12",
                LocalDate.of(2005, 3, 20), LocalDateTime.now() );

        List<Person> list = new ArrayList<>();

        list.add(new Person("Olov", "0958747765", "str.Dubinina 5",
                LocalDate.of(1992, 2, 22), LocalDateTime.now()));
        list.add(person1);
        list.add(person2);
        list.add(person3);

        objectOutputStream.writeObject(list);
        System.out.println("File has been written!");
        objectOutputStream.close();

        System.out.println(new String(Files.readAllBytes(Paths.get("person.data"))));


        ArrayList<Person> newList = new ArrayList<>();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.data"));
        newList = (ArrayList<Person>)objectInputStream.readObject();

        for(Person p : newList) {
            System.out.println(p.getName());
            System.out.println(p.toString());
        }

    }
}
