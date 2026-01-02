package com.objectmodelling.ecommerceapp;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(1, "Rimjhim");

        Product p1 = new Product(101, "Laptop", 55000);
        Product p2 = new Product(102, "Mouse", 500);

        Order order = customer.placeOrder(1001);

        order.addProduct(p1);
        order.addProduct(p2);

        order.showProducts();
        System.out.println("Total Amount: " + order.calculateTotal());
    }
}
