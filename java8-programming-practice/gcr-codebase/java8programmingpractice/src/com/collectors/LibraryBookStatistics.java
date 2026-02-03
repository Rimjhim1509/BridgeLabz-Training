package com.collectors;

import java.util.*;
import java.util.stream.Collectors;
class Book{
	String genre ;
	int pages;
	public Book(String genre , int pages) {
		this.genre = genre;
		this.pages=pages;
	}
	
}
public class LibraryBookStatistics {

    public static void main(String[] args) {

        Book book1 = new Book("Fiction", 300);
        Book book2 = new Book("Fiction", 450);
        Book book3 = new Book("Science", 500);
        Book book4 = new Book("Science", 350);
        Book book5 = new Book("History", 400);

        List<Book> books = Arrays.asList(book1, book2, book3, book4, book5);

        Map<String, IntSummaryStatistics> summaryByGenre =
                books.stream()
                     .collect(Collectors.groupingBy(
                             b -> b.genre,
                             Collectors.summarizingInt(b -> b.pages)
                     ));

        summaryByGenre.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("Total Pages: " + stats.getSum());
            System.out.println("Average Pages: " + stats.getAverage());
            System.out.println("Max Pages: " + stats.getMax());
        });
    }
}
