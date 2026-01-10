package com.FoodLoop;

public class FoodLoop {
	public static void main(String[] args) {
		FoodItem f1 = new VegItem("Paneer Butter Masala", 250, 5);
        FoodItem f2 = new NonVegItem("Chicken Biryani", 400, 3);
        FoodItem f3 = new VegItem("Butter Naan", 50, 10);
        Order order = new Order();
        order.addItem(f1);
        order.addItem(f2);
        order.addItem(f3);
        order.placeOrder();

        System.out.println("Order Status: " + order.getStatus());
        System.out.println("Total Price : " + order.getTotal());
	}
}
