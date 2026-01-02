package com.inheritance.assistedproblem.employmanagementsystem;

 class Developer extends Employee {
	String programmingLanguage ;
	Developer(String name ,int id ,double salary , String programmingLanguage){
		super(name,id,salary);
		this.programmingLanguage = programmingLanguage;
	}
	void displayDetails(	) {
		super.displayDetails();
		System.out.println("Language : "+ programmingLanguage);
	}

}
