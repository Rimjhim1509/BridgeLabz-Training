package com.icecreamrush;

public class Icecream {
	private String flavorName;
	private int soldCount;
	
	public Icecream(String flavourName,int soldCount) {
		this.flavorName=flavourName;
		this.soldCount = soldCount;
	}
	public String getFlavorName() {
		return flavorName ;
	}
	public int getSoldCount() {
		return soldCount;
	}
	@Override
	public String toString() {
		return "Icecream [ flavorName=" + flavorName + ", soldCount=" + soldCount + " ]";
	}
	
}
