package com.encapsulation.employeemanagementsystem;

 class PartTimeEmployee  extends Employee implements Department{
	 private int hoursWorked;
	 private double hourlyRate;
	 private String department;
	 PartTimeEmployee(int id,String name ,double rate, int hours){
		 super(id,name,0);
		 this.hourlyRate =  rate;
		 this.hoursWorked = hours;
	 }
	 public double calculateSalary() {
			return hourlyRate *hoursWorked;
		}
	public void assignDepartment(String deptName) {
		department = deptName;
	}
	public String getDepartmentDetails() {
		return department;
	}

}
