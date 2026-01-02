package com.inheritance.assistedproblem.employmanagementsystem;

public class Main {
	public static void main(String[] args) {
		Employee m = new Manager("Shloka" , 123 ,80000,10);
		Employee d= new Developer("Rajesh" , 124 , 50000 , "Java");
		Employee i =new Intern("Rahul" , 103 , 30000 , 6);
		System.out.println("Manager Details ");
		m.displayDetails();
		System.out.println("Developer Details ");
		d.displayDetails();
		System.out.println("Intern Details ");
		i.displayDetails();
		
	}
}
