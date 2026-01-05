package com.encapsulation.employeemanagementsystem;

abstract class Employee {

    private int employeeId;
    private String name;
    private double baseSalary;

    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation: getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    protected double getBaseSalary() {
        return baseSalary;
    }

    // Abstract method (must be implemented)
    public abstract double calculateSalary();

    // Concrete method (common for all)
    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
        System.out.println("-------------------");
    }
}
