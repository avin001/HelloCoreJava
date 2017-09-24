package com.example.java;

import java.util.ArrayList;
import java.util.List;

class Book {

    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

}

    public class ArrayListExample {

        public static void main(String[] args) {

            List<Book> list = new ArrayList<Book>();

            Book b1 = new Book(10121, "Head First Java", "Kathy Sierra and Bert Bates",
                               "O Reilly", 200);
            Book b2 = new Book(12312, "Thinking in Java", "Bruce Eckel", "Prentice Hall", 10);
            Book b3 = new Book(23232, "Effective Java", "Joshua Bloch", "Person", 20);

            list.add(b1);
            list.add(b2);
            list.add(b3);

            for (Book b:list
                 ) {
                System.out.println("Book id: " + b.id + ", " + "Book Name: " + b.name + ", " +
                                   "Author(s): " + b.author + ", " + "Quantity: " + b.quantity);
            }
        }
}
