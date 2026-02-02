package com.functionalinterface.markerinterface.clonableprototypeobject;

public class Main {

    public static void main(String[] args) {

        Product original = new Product("ree45", "Laptop", 80000);

        Product copy = original.clone();

        copy.price = 75000;

        System.out.println(original.price);
        System.out.println(copy);
    }
}
