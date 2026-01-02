package com.inheritance.assistedproblem.animalhierarchy;

class Bird extends Animal{
	public Bird(String name , int age) {
		super(name,age);
		
	}
	public void makeSound() {
		System.out.print("The birds are chirping .");
	}
}