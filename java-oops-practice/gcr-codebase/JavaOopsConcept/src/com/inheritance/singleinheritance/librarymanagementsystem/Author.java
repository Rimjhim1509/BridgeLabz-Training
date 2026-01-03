package com.inheritance.singleinheritance.librarymanagementsystem;

class Author extends Book{
	String name ;
	String bio ;
	Author(String title , int year ,String name , String bio){
		super(title , year);
		this.name = name;
		this.bio = bio;
	}
	void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + year);
        System.out.println("Author : "+ name);
    }

}
