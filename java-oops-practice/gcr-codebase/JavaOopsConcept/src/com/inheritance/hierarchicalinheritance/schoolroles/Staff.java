package com.inheritance.hierarchicalinheritance.schoolroles;
class Staff extends Person {
    private String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("I am Staff");
    }
}
