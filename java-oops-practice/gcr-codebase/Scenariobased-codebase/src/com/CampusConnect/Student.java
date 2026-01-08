package com.CampusConnect;
import java.util.*;
class Student extends Person implements ICourseActions {
    private Map<Course, Double> grades; // course -> grade

    public Student(String name, String email, String id) {
        super(name, email, id);
        grades = new HashMap<>();
    }

    @Override
    public void enrollCourse(Course course) {
        course.addStudent(this);
        grades.put(course, 0.0);
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    @Override
    public void dropCourse(Course course) {
        course.removeStudent(this);
        grades.remove(course);
        System.out.println(name + " dropped " + course.getCourseName());
    }

    public void setGrade(Course course, double grade) {
        if (grades.containsKey(course)) {
            grades.put(course, grade);
        }
    }

    public double calculateGPA() {
        if (grades.isEmpty()) return 0;
        double total = 0;
        for (double g : grades.values()) total += g; // simple sum
        return total / grades.size();
    }

    @Override
    public void printDetails() {
        System.out.println("Student: " + name + " | Email: " + email + " | ID: " + id + " | GPA: " + calculateGPA());
    }
}

