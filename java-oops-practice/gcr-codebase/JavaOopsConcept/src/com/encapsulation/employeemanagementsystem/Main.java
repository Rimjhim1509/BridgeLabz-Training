package com.encapsulation.employeemanagementsystem;

import java.util.*;
public class Main {
public static void main(String[] args) {
	List<Employee> employees = new ArrayList<>();
	Employee e1 =new FullTimeEmployee(1,"Shastri",70000);
	Employee e2 =new PartTimeEmployee(2,"ravi",4000,4);
	((Department)e1).assignDepartment("IT");
	((Department)e2).assignDepartment("HR");
	employees.add(e1);
	employees.add(e2);
	e2.displayDetails();
	e1.displayDetails();
}
}
