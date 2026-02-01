package com.lambdaexpressions.sortingecommerce;

import java.util.*;
public class Shop {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Headphone",2300,3,9));
		products.add(new Product("hair Straightner",500000,9,12));
		products.add(new Product("Mobile Phone",12000,5,30));
		products.add(new Product("Washing Machine",20000,6,10));
		
		
		products.sort((a,b) -> a.price - b.price);
		for(Product p : products) {
			System.out.println(p.name);
		}
		System.out.println();
		products.sort((a,b) -> b.rating - a.rating);
		for(Product p : products) {
			System.out.println(p.name +" -> "+ p.rating);
		}
		System.out.println();
		products.sort((a,b) -> b.discount - a.discount);
		for(Product p : products) {
			System.out.println(p.name+" -> "+ p.discount);
		}
	}
}
