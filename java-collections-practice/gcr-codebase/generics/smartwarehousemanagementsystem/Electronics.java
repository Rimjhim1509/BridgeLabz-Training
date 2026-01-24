package com.generics.smartwarehousemanagementsystem;

public class Electronics extends WarehouseItem {
	public Electronics(String name, int id) {
		super(name,id);
	}
	public String getCategory() {
		return "electronics"  ;
	}
}
