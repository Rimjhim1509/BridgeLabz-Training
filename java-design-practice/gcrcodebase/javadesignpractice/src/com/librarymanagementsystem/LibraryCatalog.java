package com.librarymanagementsystem;

public class LibraryCatalog {
	public static LibraryCatalog instance = new LibraryCatalog();
	//to ensure no one create object we make private constructor of LibraryCatalog
	
	private LibraryCatalog() {}
	public static LibraryCatalog getInstance() {
		return instance;
	}
	public void showMessage() {
        System.out.println("Single Library Catalog in use");
    }

}
