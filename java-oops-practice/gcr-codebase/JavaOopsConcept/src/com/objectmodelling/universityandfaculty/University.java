package com.objectmodelling.universityandfaculty;

import java.util.*;

//Create a University with multiple Faculty members and Department objects
public class University {
	private String name ; 
	private List<Departments>departments;
	
	public University(String name ) {
		this.name = name;
		this.departments = new ArrayList<>() ;
	}
	public void addDepartment(Departments dept ) {
		departments.add(dept);
	}
	public void showDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Departments d : departments) {
            System.out.println("- " + d.getDeptName());
        }
    }

    // Simulate deletion of University
    public void deleteUniversity() {
        departments.clear(); // departments destroyed
        System.out.println("University deleted. All departments removed.");
    }
}
