package com.inheritance.assistedproblem.employmanagementsystem;

class Manager extends Employee{
	int teamSize = 0 ;
	Manager(String name ,int id ,double salary, int teamSize){
			super(name,id,salary);
			this.teamSize =teamSize;
	}
	void displayDetails() {
		System.out.print("Team size "+teamSize);
		super.displayDetails();
		
	}
}