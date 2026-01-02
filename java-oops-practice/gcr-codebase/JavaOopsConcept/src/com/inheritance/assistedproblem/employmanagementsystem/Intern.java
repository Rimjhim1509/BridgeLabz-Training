package com.inheritance.assistedproblem.employmanagementsystem;

class Intern  extends Employee{
	int duration = 0 ;
	Intern(String name ,int id ,double salary, int duration){
			super(name,id,salary);
			this.duration =duration;
	}
	void displayDetails() {
		System.out.print("Duration  "+duration+" months.");
		super.displayDetails();
		
	}
}
