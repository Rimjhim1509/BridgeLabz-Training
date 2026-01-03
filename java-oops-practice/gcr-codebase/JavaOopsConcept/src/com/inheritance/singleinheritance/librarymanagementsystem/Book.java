package com.inheritance.singleinheritance.librarymanagementsystem;

public class Book {
	int year ;
	String title ;
	Book(String title , int year){
		this.title = title ; 
		this.year = year ;
	}
	void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + year);
        
    }

}
