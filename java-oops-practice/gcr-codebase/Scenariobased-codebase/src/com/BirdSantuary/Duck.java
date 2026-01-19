package com.BirdSantuary;

class Duck extends Bird implements Swimmable,Flyable {
	public Duck(String name ,String id) {
		super(name ,"Duck",id);
	}
	public void fly() {
		System.out.println("Duck can Fly .");
	}
	public void swim() {
		System.out.println("Duck can swim.");
	}
}
