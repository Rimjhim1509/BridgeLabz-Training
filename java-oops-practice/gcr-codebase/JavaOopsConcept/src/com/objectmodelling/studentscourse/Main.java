package com.objectmodelling.studentscourse;

public class Main {
    public static void main(String[] args) {

        School school = new School("ABC School");

        Student s1 = new Student(1, "Ravi");
        Student s2 = new Student(2, "Anita");

        Course c1 = new Course("Java");
        Course c2 = new Course("Python");

        // Aggregation
        school.addStudent(s1);
        school.addStudent(s2);

        // Association (many-to-many)
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        // Output
        s1.showCourses();
        System.out.println();
        c1.showStudents();
    }
}
