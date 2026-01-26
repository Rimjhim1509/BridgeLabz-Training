package com.collections.map.shoppingcart;

import java.util.*;

public class ShoppingCart {

	private HashMap<String, Integer> priceMap = new HashMap<>();
	private LinkedHashMap<String, Integer> cartOrder = new LinkedHashMap<>();

	public void addProduct(String product, int price) {
		priceMap.put(product, price);
		cartOrder.put(product, price);
	}

	public void showCartOrder() {
		System.out.println("Cart Order (LinkedHashMap): " + cartOrder);
	}

	public void showSortedByPrice() {
		TreeMap<Integer, List<String>> sortedByPrice = new TreeMap<>();

		for (String product : priceMap.keySet()) {
			int price = priceMap.get(product);

			if (!sortedByPrice.containsKey(price)) {
				sortedByPrice.put(price, new ArrayList<>());
			}
			sortedByPrice.get(price).add(product);
		}

		System.out.println("Items Sorted by Price (TreeMap): " + sortedByPrice);
	}

	public static void main(String[] args) {

		ShoppingCart cart = new ShoppingCart();

		cart.addProduct("Laptop", 70000);
		cart.addProduct("Mouse", 500);
		cart.addProduct("Keyboard", 1500);
		cart.addProduct("Monitor", 15000);

		cart.showCartOrder();
		cart.showSortedByPrice();
	}
}
