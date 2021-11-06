package com.pb.Zhilkova.hw5;

import java.util.ArrayList;
import java.util.List;
                        //переменные
public class Book {
    public static List<Book> books = new ArrayList<>();
    private String author;
    private String title;
    private int age;
                    //констпуктор
    public Book(String author, String title, int age) {
        this.author = author;
        this.title = title;
        this.age = age;
    }
                            //геттеры  и сеттеры
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public int getAge() {
        return age;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public String toString(){
        return "The book:"+ title +";" + "autor:" + author + ";" + "age:" + age + ".";
    }
}
