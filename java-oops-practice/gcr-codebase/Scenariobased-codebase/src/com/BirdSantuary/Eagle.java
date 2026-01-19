package com.BirdSantuary;

 class Eagle extends Bird implements Flyable {
	public Eagle(String name ,String id) {
		super(name ,"Eagle",id);
	}
	public void fly() {
		System.out.println("eagle can fly.");
	}
}
