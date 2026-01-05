package com.encapsulation.employeemanagementsystem;

public class FullTimeEmployee extends Employee implements Department {
	private String department;
	FullTimeEmployee(int id , String name , double baseSalary){
		super(id ,name,baseSalary);
	}
	public double calculateSalary() {
		return getBaseSalary();
	}
	public void assignDepartment(String deptName) {
		department = deptName;
	}
	public String getDepartmentDetails() {
		return department;
	}
}
