package com.encapsulation.ecommerceplatform;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Electronics(1,"refrifgerator",70000));
		products.add(new Clothing(2, "Shirt", 2000));
        products.add(new Groceries(3, "Rice", 1500));
        for(Product p : products) {
        	double tax =0;
        	if(p instanceof Taxable) {
        		tax =((Taxable) p).calculateTax();
        		
        	}
        	double finalPrice =
                    p.getPrice() + tax - p.calculateDiscount();

            System.out.println(
                    p.getName() + " Final Price: " + finalPrice);

        }
	}
}
