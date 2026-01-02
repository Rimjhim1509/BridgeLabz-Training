package com.inheritance.assistedproblem;

class Cat extends Animal {
	public Cat(String name,int age) {
		super(name ,age);
	}
	public void makeSound() {
		System.out.println("The cat sounds meow .");
		
	}
}