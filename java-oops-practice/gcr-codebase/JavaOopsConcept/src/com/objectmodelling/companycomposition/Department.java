package com.objectmodelling.companycomposition;
import java.util.*;
public class Department {
	String deptName;
	List<Employee> employees = new ArrayList<>();
	Department(String deptName){
		this.deptName = deptName ;
		System.out.println("Department : "+ deptName);
	}
	void addEmployee(String empName) {
		employees.add(new Employee(empName));
	}
	
}
