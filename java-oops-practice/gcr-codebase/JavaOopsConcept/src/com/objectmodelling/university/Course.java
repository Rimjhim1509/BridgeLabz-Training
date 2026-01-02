 package com.objectmodelling.university;
import java.util.*;
public class Course {
	private String courseName;
    private Proffesor professor;
    private List<Student> students;
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // student side communication
    public void addStudent(Student student) {
        students.add(student);
    }

    // professor side communication
    public void assignProfessor(Proffesor professor) {
        this.professor = professor;
    }

    public void showDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + professor.getName());

        System.out.println("Students:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}


