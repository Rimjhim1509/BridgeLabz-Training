package com.CampusConnect;
import java.util.*;
public class Course {
	private String courseName;
	private Faculty faculty;
	private List<Student> students ;
	public Course(String courseName) {
		this.courseName = courseName;
		students = new ArrayList<>();
	}
	public String getCourseName() {
		return courseName;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	public Faculty getfaculty() {
		return faculty;
	}
	public void addStudent(Student s) {
		students.add(s);
	}
	public void removeStudent(Student s) {
		students.remove(s);
	}
	public void listOfStudents() {
		System.out.print("Student in "+ courseName +" ");
		for(Student s: students){
			System.out.println(s.name);
		}
	}

}
