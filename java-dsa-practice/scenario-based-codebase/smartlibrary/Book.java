package com.smartlibrary;

public class Book {
	private String title;
	private String author;
	public Book(String title, String author) {
		this.author =author;
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	@Override
	public String toString() {
		return "Book[ Title : "+ this.title + "Author : " +author+ "]";
	}
}
