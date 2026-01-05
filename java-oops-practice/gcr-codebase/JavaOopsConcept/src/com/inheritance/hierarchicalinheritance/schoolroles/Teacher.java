package com.inheritance.hierarchicalinheritance.schoolroles;

class Teacher extends Person {
    private String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("I am a Teacher");
    }
}
