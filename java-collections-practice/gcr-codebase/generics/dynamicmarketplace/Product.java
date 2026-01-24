package com.generics.dynamicmarketplace;

class Product<T extends Category> {
	private String name;
	private double price;
	private T category;
	public Product(String name ,double price, T category) {
		this.name =name;
		this.category =category;
		this.price =price;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		 this.price = price;
	}
	public T getCategory() {
		return category;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", category=" + category + "]";
	}
}