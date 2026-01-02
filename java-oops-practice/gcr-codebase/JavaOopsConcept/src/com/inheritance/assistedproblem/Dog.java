package com.inheritance.assistedproblem;

class Dog extends Animal {
	public Dog(String name , int age) {
		//parent constructor
		super(name ,age);
	}
	public void makeSound() {
		System.out.print("Dog Barks ");
	}
}