package com.objectmodelling.studentscourse;

import java.util.*;

public class School {
	 String schoolName;
	private List<Student> students ;
	//Model an aggregation relationship between School and Student
	public School(String schoolName) {
		this.schoolName=schoolName;
		this.students = new ArrayList<>();
	}
	public void addStudent(Student student ) {
		students.add(student);
	}
	
	public void showDetails() {
		for(Student s : students) {
			System.out.print("- " + s.getName());
		}
	}
}
