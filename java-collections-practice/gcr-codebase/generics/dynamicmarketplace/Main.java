package com.generics.dynamicmarketplace;

public class Main {
	public static void main(String[] args) {
		Product<BookCategory> book = new Product<>("Java Basics", 500, new BookCategory());

        Product<ClothingCategory> shirt  = new Product<>("T-Shirt", 800, new ClothingCategory());

       
        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        

        DiscountUtils.applyDiscount(book, 10);
        DiscountUtils.applyDiscount(book, 5);

        catalog.displayProducts();
	}
}
