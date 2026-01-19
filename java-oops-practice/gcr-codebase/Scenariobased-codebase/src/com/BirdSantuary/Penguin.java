package com.BirdSantuary;

public class Penguin extends Bird implements Swimmable {
	public Penguin(String name , String id) {
		super(name ,"Penguin" ,id);
	}
	public void swim() {
		System.out.print("Penguin can swim more fast.");
	}
}
