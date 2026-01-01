package com.objectmodelling.universityandfaculty;
import java.util.*;
public class Departments {
	private String deptName;
	private List<Faculty> facultyList ;
	
	public Departments(String deptName) {
		this.deptName = deptName;
		this.facultyList = new ArrayList<>();
	}
	public void addFaculty(Faculty faculty) {
		facultyList.add(faculty);
	}
	public void showFaculty() {
		System.out.println("Faculty in "+deptName + " department");
		for(Faculty f : facultyList) {
			System.out.println("- " + f.getName());
		}
	}
	public String getDeptName() {
		return deptName;
	}

}
