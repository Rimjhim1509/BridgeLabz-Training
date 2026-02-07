package com.librarymanagementsystem;

class FactoryClass {

    public static User createUser(String type) {
        if (type.equalsIgnoreCase("student"))
            return new Students();
        else if (type.equalsIgnoreCase("faculty"))
            return new Faculty();
        else if (type.equalsIgnoreCase("librarian"))
            return new Librarian();
        else
            throw new IllegalArgumentException("Invalid user type");
    }
}
