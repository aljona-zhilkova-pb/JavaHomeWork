package com.pb.Zhilkova.hw11;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Scanner;;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    private static ArrayList<Telephone> Telephone = new ArrayList<Telephone>();

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner in = new Scanner(System.in);
        boolean exit = false;

        do {
            System.out.println("1.Добавить контакт\n" +
                    "2.Удалить контакт\n" +
                    "3.Вывести на экран все записи\n" +
                    "4.Поиск по номеру\n" +
                    "5.Поиск по имени\n" +
                    "6.Редактировать\n" +
                    "7.Запись в файл всех данных\n" +
                    "8.Загрузка из файла всех данных\n" +
                    "9.Выход?");
            int com = in.nextInt();

            switch (com) {
                case 1:
                    contactNew();
                    break;
                case  2:
                    contactDelete();
                    break;
                case 3:
                    contactView();
                    break;
                case 4:
                    contactSearchPhone();
                    break;
                case 5:
                    contactSearchName();
                    break;
                case 6:
                    contactEdit();
                    break;
                case 7:
                    contactWrite();
                    break;
                case 8:
                    contactRead();
                    break;
                case 9:
                    exit = true;
                    break;
                default:
                    System.out.println("Неверная команда. Попробуйте еще раз. \n");
            }
        } while (!exit);
    }

    private static void contactNew() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = in.next();
        System.out.println("Введите номер телефона: ");
        String phone = in.next();

        System.out.println("Введите адрес: ");
        String address = in.next();
        System.out.println("Введите дату рождения через в формате XXXX XX XX через пробел: ");
        //LocalDate dateOfBirth = LocalDate.parse(in.next());
        LocalDate dateOfBirth = LocalDate.of(in.nextInt(), in.nextInt(), in.nextInt());

        try {
            Telephone.add( new Telephone(name, phone, address, dateOfBirth, LocalDateTime.now()));
            System.out.println("Контакт сохранен! ");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("String: " + e);
        }
        System.out.println();
    }

    private static void contactDelete() {
        Scanner in = new Scanner(System.in);

        contactView();

        System.out.println("Введите номер удаляемого контакта: ");
        int index = in.nextInt();

        try {
            Telephone.remove(index - 1);
            System.out.println("Удалено! ");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("String: " + e);
        }
        System.out.println();
    }

    private static void contactView() {
        //System.out.println("Список: ");
        if (Telephone.isEmpty()) {
            System.out.println("Список пуст! ");
        } else {
            for (int i = 0; i < Telephone.size(); i++) {
                System.out.println("#" + (i + 1) + " " + Telephone.get(i));
            }
            System.out.println();
        }
    }

    private static void contactSearchPhone() {
        int phoneIndex = -1;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер абонента для поиска: ");
        String phoneSearch = in.next();

        for (int i = 0; i < Telephone.size(); i++) {
            if (Telephone.get(i).getPhone().equals(phoneSearch)) {
                phoneIndex = i;
            }
        }
        if (phoneIndex >= 0) {
            System.out.println("#" + (phoneIndex+1) + Telephone.get(phoneIndex));
        } else {
            System.out.println("Абонент с таким номером не найден\n");
        }
    }

    private static void contactSearchName() {
        int phoneIndex = -1;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя абонента для поиска: ");
        String nameSearch = in.nextLine();

        for (int i = 0; i < Telephone.size(); i++) {
            if (Telephone.get(i).getName().equals(nameSearch)) {
                phoneIndex = i;
            }
        }
        if (phoneIndex >= 0) {
            System.out.println("#" + (phoneIndex+1) + Telephone.get(phoneIndex));
        } else {
            System.out.println("Абонент с таким именем не найден\n");
        }
    }

    private static void contactEdit() {
        Scanner in = new Scanner(System.in);

        contactView();

        System.out.println("Введите номер редактируемого контакта: ");
        int index = in.nextInt();


        try {
            System.out.println("Прошлое имя " + Telephone.get(index-1).getName());;
            System.out.println("Введите новое имя: ");
            Telephone.set(index-1, Telephone.get(index-1)).setName(in.next(), LocalDateTime.now());
            System.out.println("Новое имя: " + Telephone.get(index-1).getName());

            System.out.println("Прошлый телефон: " + Telephone.get(index-1).getPhone());
            System.out.println("Введите новый номер телефона: ");
            Telephone.set(index-1, Telephone.get(index-1)).setPhone(in.next(), LocalDateTime.now());
            System.out.println("Новый телефон: " + Telephone.get(index-1).getPhone());

            System.out.println("Прошлый адрес: " + Telephone.get(index-1).getAddress());
            System.out.println("Введите новый адрес: ");
            Telephone.set(index-1, Telephone.get(index-1)).setAddress(in.next(), LocalDateTime.now());
            System.out.println("Новый адрес: " + Telephone.get(index-1).getAddress());
            //String address = in.next();

            System.out.println("Прошлая дата рождения: " + Telephone.get(index-1).getDateOfBirth());
            System.out.println("Введите новую дату рождения через в формате XXXX XX XX через пробел: ");
            Telephone.set(index-1, Telephone.get(index-1)).setDateOfBirth(LocalDate.of(in.nextInt(), in.nextInt(), in.nextInt()),
                    LocalDateTime.now());
            System.out.println("Новая дата рождения: " + Telephone.get(index-1).getDateOfBirth());
            //LocalDate dateOfBirth = LocalDate.of(in.nextInt(), in.nextInt(), in.nextInt());

            Telephone.set(index-1, Telephone.get(index-1));
            System.out.println("Контакт сохранен! ");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("String: " + e);
        }
        System.out.println();
    }

    private static void contactWrite() throws IOException {
        File file = Paths.get("Telephones.data").toFile();
        FileOutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(Telephone);
        System.out.println("Файл записан! ");
        objectOutputStream.close();
        System.out.println(new String(Files.readAllBytes(Paths.get("Telephones.data"))));
    }
    private static void contactRead() throws IOException, ClassNotFoundException {
        ArrayList<Telephone> newTelephones = new ArrayList<>();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Telephones.data"));
        newTelephones = (ArrayList<Telephone>)objectInputStream.readObject();
        for (Telephone c : newTelephones) {
            System.out.println(c.toString());
        }
    }
}
