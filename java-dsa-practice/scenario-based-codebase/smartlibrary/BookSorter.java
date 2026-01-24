package com.smartlibrary;

public class BookSorter {
	private Book[] books ;
	public BookSorter(Book[] books) {
		this.books=books;
	}
	void sort() {
		for(int i= 1;i<books.length ; i++) {
			Book currentBook =books[i];
			int j = i-1;
			while(j>=0 && currentBook.getTitle().compareToIgnoreCase(books[j].getTitle()) < 0) {
				books[j+1] = books[j];
				j--;
			}
			books[j+1] = currentBook;
		}
	}
	void display() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
