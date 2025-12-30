package com.constructors.instancevariable;

public class Product {
	//instance Variable
	String productName;
	double price;
	//class variable
	static int totalProducts ;
	
	Product(String productName,double price){
		this.productName =productName ;
		this.price = price ;
		totalProducts++;
	}
	void displayProduct() {
		System.out.print("Product name is "+productName);
		System.out.println("Price is "+ price);
	}
	static void displayTotalProduct() {
		System.out.print("Total Product : " + totalProducts);
		
	}

}
 class ProductTest{
	public static void main(String[] args) {
		Product p1 = new Product("Laptop" , 80000);
		Product p2 = new Product("Mobile" , 30000);
		p1.displayProduct();
		p2.displayProduct();
		Product.displayTotalProduct();

	}
}
