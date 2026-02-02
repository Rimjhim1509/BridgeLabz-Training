package com.functionalinterface.markerinterface.clonableprototypeobject;

public class Product implements Cloneable {
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	String id ;
	String name;
	double price;
	public Product(String id , String name,double price) {
		this.name =name;
		this.id =id;
		this.price =price;
	}
	public Product clone() {
		try {
			return (Product) super.clone();
		}catch(CloneNotSupportedException e) {
			throw new RuntimeException(e); 
		}
	}
	
}
