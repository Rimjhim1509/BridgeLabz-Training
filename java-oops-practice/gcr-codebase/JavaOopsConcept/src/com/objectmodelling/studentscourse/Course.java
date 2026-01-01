package com.objectmodelling.studentscourse;

import java.util.*;

public class Course {
	private String courseName;
	private List<Student> students ;
	
	public Course(String courseName) {
		this.courseName = courseName ;
		this.students = new ArrayList<>();
	}
	
	//to add students we take student object from Student class and check that 
	//if not available then add student to course list of students
	public void addStudent(Student student) {
		if(!students.contains(student)) {
			students.add(student);
		}
	}
	public void showStudent() {
		System.out.print("Students enrolled in course : "+ courseName);
	}
	public String getCourseName() {
        return courseName;
    }
	public void showStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }

}
