package com.librarymanagementsystem;

public class Main {
    public static void main(String[] args) {
    	LibraryCatalog c1 = LibraryCatalog.getInstance();
        LibraryCatalog c2 = LibraryCatalog.getInstance();

        System.out.println(c1 == c2); 
        
        User u1 = FactoryClass.createUser("student");
        User u2 = FactoryClass.createUser("faculty");

        u1.role();
        u2.role();
    }
}
