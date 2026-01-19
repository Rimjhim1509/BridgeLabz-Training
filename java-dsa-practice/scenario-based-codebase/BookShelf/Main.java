package com.BookShelf;

public class Main {
    public static void main(String[] args) {

        BookShelf lib = new BookShelf();

        Book b1 = new Book("Harry Potter", "J.K. Rowling");
        Book b2 = new Book("The Hobbit", "Tolkien");
        Book b3 = new Book("Brief History of Time", "Stephen Hawking");

        lib.addBook("Fiction", b1);
        lib.addBook("Fiction", b2);
        lib.addBook("Science", b3);

        lib.displayCatalog();

        System.out.println("---- Borrowing ----");
        lib.borrowBook("Fiction", b1);

        //lib.displayCatalog();
    }
}
