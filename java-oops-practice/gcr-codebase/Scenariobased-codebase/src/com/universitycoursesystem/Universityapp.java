package com.universitycoursesystem;

public class Universityapp {
public static void main(String[] args) {
	Student s1 =new Undergraduate(1,"Rimjhim");
	Student s2 =new Postgraduate(1,"Sakshi");
	

    Enrollment e1 = new Enrollment("Spring");

    Faculty f1 = new Faculty();

    ((Undergraduate)s1).calculateGPA(new double[]{80, 70, 90});
    ((Postgraduate)s2).calculateGPA(new double[]{75, 85});

    s1.getTranscript();
    s2.getTranscript();

    f1.assignGrade(88);
    e1.assignGrade(35);

}
}
