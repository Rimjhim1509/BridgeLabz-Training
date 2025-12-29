package com.constructors.levelone;

public class Person {
	String name ;
	int age ;
	Person(){
		this.name = "Aryan";
		this.age = 23;
		
	}
	Person(Person other){
		this.name = other.name;
		this.age = other.age;
	}
	void display() {
		System.out.print(name + age);
	}
public static void main(String[] args){
	Person p1 = new Person();
	p1.display();
}

}
