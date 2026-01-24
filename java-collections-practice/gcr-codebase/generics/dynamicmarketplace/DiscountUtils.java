package com.generics.dynamicmarketplace;

public class DiscountUtils {
	public static <T extends Product<?>> void applyDiscount(T product ,double percentage) {
		double discountedprice = product.getPrice() - (product.getPrice()*percentage/100);
		product.setPrice(discountedprice);
	}
}
