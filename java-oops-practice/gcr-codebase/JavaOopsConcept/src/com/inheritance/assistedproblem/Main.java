package com.inheritance.assistedproblem;

public class Main {
	public static void main(String[] args) {
		Dog a1 =new Dog("Bruno",21);
		Animal a2 = new Cat("Kitto" , 12);
		Animal a3 = new Bird("Hiro",11);
		a1.makeSound(); 
		a2.makeSound();
		a3.makeSound();
	}
}
