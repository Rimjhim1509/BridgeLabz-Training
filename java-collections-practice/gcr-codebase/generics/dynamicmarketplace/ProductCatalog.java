package com.generics.dynamicmarketplace;
import java.util.*;

public class ProductCatalog {
	private List<Product<? extends Category>> products = new ArrayList<>();
	public void addProduct(Product<? extends Category> product) {
		products.add(product);
	}
	public void displayProducts() {
		for(Product<? extends Category> product :products) {
			System.out.print(product);
		}
	}
}
