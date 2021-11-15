package com.pb.Zhilkova.hw5;

public class Library {

    public static void main(String[] args) {
        // массив книг
        Book book1 = new Book("Дениел Кіз", "Квіти для Елджернона", 2015);
        Book book2 = new Book("Кристи Лефтери", "Хранитель пчел из Алеппо", 2020);
        Book book3 = new Book("Труфен Капоте", "Завтрак у Тифани", 2015);

        Book[] books = {book1, book2, book3};

        for (Book book : books) {
            System.out.println(book.toString());
        }

        Reader reader1 = new Reader("Петров П.П.", 001, "Менеджмент", "1.01.2001", "+380686886868");
        Reader reader2 = new Reader("Иванов И.И.", 002, "Экономическая теория", "2.02.2002", "+380676776767");
        Reader reader3 = new Reader("Смирнов С.С.", 003, "Маркетинг", "3.03.2003", "+380636336363");

        Reader[] readers = {reader1, reader2, reader3};

        for (Reader reader : readers) {
            System.out.println(reader.toString());
        }

        reader1.returnBook(1);
        reader2.returnBook(2);
        reader3.returnBook(3);

        reader1.takeBook(3);
        reader2.takeBook(2);
        reader3.takeBook(1);

        reader1.takeBook(book1.getTitle());
        reader2.takeBook(book2.getAuthor(), book2.getTitle());
        reader3.takeBook(book3.getTitle(), book3.getAuthor());


        reader2.returnBook(book1.getTitle(), book1.getAuthor(), book3.getTitle(), book3.getAuthor());
        reader3.returnBook(book2.getTitle());
    }
}
