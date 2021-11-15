package com.pb.Zhilkova.hw5;



import static com.pb.Zhilkova.hw5.Book.books;

//переменные
public class Reader {
    private String nameReader;
    private int numberLibrary;
    private String faculty;
    private String birthday;
    private String cellphone;

                            //конструктор
    public Reader(String nameReader, int numberLibrary, String faculty, String birthday, String cellphone) {
    this.nameReader = nameReader;
    this.numberLibrary = numberLibrary;
    this.faculty = faculty;
    this.birthday = birthday;
    this.cellphone = cellphone;
    }
                            //геттеры и сеттеры
    public String getNameReader() {

        return nameReader;
    }
    public void setNameReader(String nameReader) {

        this.nameReader = nameReader;
    }

    public Integer getNumberLibrary() {
        return numberLibrary;
    }
    public void setNumberLibrary(int numberLibrary) {

    this.numberLibrary = numberLibrary;
    }

    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty){

        this.faculty = faculty;
    }

    public String birthday() {

        return birthday;
    }
    public void setBirthday(String birthday){

        this.birthday = birthday;
    }

    public String getCellphone() {

        return cellphone;
    }
    public void setCellphone(String cellphone) {

        this.cellphone = cellphone;
    }
    public String toString() {
          return "The reader:" + nameReader + ", the number in Librery:" + numberLibrary + ", the faculty:" + faculty + ", the date of birthday:" + birthday + ", the number of  the cellphone" + cellphone + ".";
    }



                    //методы takeBook(), returnBook():
                        // кол-во книг взял и вернул
    public void takeBook(int x) {
        System.out.println("The reader:" + nameReader + "take" + x + "book(books).");
    }

    public void returnBook(int y) {
        System.out.println("The reader:" + nameReader + "return" + y + "book(books).");
    }
                    //читатель н взял(вернул) такие книги
    public void takeBook(Book... books) {
        System.out.println("The reader:" + nameReader + "take book(books): ");
        for (Book book: books){
            System.out.println(book);
        }
    }

    public void returnBook(Book... books) {
        System.out.println("The reader:" + nameReader + "return book(books): ");
        for (Book book: books){
            System.out.println(book);
        }
    }

                        //читатель взял(вернул) книги:название, втор, год издательства
    public void takeBook(String... title) {
        System.out.println(nameReader + "take book(books): " + "." );
        for (Book book : books) {
            System.out.println(book.getTitle() + "," + book.getAuthor() + "," + book.getAge() + ".");
        }
    }

    public void returnBook(String... title) {
        System.out.println(nameReader + "return book(books): " + "." );
        for (Book book : books) {
            System.out.println(book.getTitle() + "," + book.getAuthor() + "," + book.getAge() + ".");
        }
    }
}









