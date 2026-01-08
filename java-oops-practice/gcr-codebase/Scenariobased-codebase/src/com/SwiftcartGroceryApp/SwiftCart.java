package com.SwiftcartGroceryApp;

public class SwiftCart {

    public static void main(String[] args) {

        Product p1 = new Perishable("Milk", 50);
        Product p2 = new NonPerishable("Soap", 30);
        Product p3 = new Perishable("Eggs", 60);

        Cart cart = new Cart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.showCart();
    }
}
