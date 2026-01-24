package com.generics.smartwarehousemanagementsystem;

public class Groceries  extends WarehouseItem {
	public Groceries(String name, int id) {
		super(name,id);
	}
	public String getCategory() {
		return "groceries"  ;
	}
}
