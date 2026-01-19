package com.BookShelf;
import java.util.* ;
public class BookShelf {
	private HashMap<String , LinkedList<Book>> catalog =new HashMap<>();
	private HashSet<Book> uniqueBooks = new HashSet<>();
	public void addBook(String genre ,Book book) {
		if(!uniqueBooks.add(book)) {
			System.out.print("Duplicate book not allowed");
			return ;
		}
		catalog.putIfAbsent(genre, new LinkedList<>());
		//adding book to list
		catalog.get(genre).add(book);
		System.out.println("Book added: " + book);

	}
	public void borrowBook(String genre, Book book) {
        if (!catalog.containsKey(genre)) {
            System.out.println("Genre not found!");
            return;
        }

        LinkedList<Book> books = catalog.get(genre);

        if (books.remove(book)) {
            uniqueBooks.remove(book);
            System.out.println("Book borrowed: " + book);
        } else {
            System.out.println("Book not available!");
        }
    }
	public void displayCatalog() {
        for (String genre : catalog.keySet()) {
            System.out.println(genre + " → " + catalog.get(genre));
        }
    }

}
