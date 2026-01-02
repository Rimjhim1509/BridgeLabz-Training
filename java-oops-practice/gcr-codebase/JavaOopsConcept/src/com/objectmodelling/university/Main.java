package com.objectmodelling.university;

public class Main {
	public static void main(String[] args) {

        University uni = new University("ABC University");

        Student s1 = new Student(1, "Ravi");
        Student s2 = new Student(2, "Anita");

        Proffesor p1 = new Proffesor(101, "Dr. Sharma");

        Course c1 = new Course("Java Programming");

        uni.addStudent(s1);
        uni.addStudent(s2);
        uni.addProffesor(p1);
        uni.addCourse(c1);

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);

        p1.assignCourse(c1);

        c1.showDetails();
    }
}
