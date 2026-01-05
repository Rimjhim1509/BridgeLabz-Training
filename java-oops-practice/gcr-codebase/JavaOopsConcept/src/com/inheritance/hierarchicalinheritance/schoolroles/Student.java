package com.inheritance.hierarchicalinheritance.schoolroles;

class Student extends Person {
    private String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("I am a Student");
    }
}
