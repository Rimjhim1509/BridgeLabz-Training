package com.inheritance.assistedproblem.employmanagementsystem;

 class Employee {
	String name ; 
	int id;
	double salary;
	public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
	void displayDetails() {
		System.out.println(name +" of "+id + " Salary Received ." + salary);
	}
}
