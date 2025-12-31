package com.constructors.instancevariable;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public static void main(String[] args) {
		Manager pg = new Manager();
		pg.employeeID  =101 ;
		pg.department = "Rimjhim";
		pg.setSalary(8.67);
		pg.display();
		System.out.println("CGPA: " + pg.getSalary());
				
	}
}


class Manager extends Employee {
    void display() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}
