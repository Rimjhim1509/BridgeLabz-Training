package com.objectmodelling.companycomposition;
import java.util.*;
public class Company {
	String companyName ;
	List<Department> departments = new ArrayList<>();
	Company(String companyName){
		this.companyName = companyName;
		System.out.println("Company add : " + companyName);
	}
	void addDepartment(String deptName) {
		departments.add(new Department(deptName));
	}
	void showCompanyDetail() {
		System.out.println("Company: " + companyName);
        for (Department d : departments) {
            System.out.println(" Department: " + d.deptName);
            for (Employee e : d.employees) {
                System.out.println("  Employee: " + e.empName);
            }
        }
	}
	void deleteCompany() {
		departments.clear();
	}
	public static void main(String[] args) {
		Company company = new Company("Technosava");
		company.addDepartment("IT");
		company.addDepartment("HR");
		company.departments.get(0).addEmployee("Rimjhim");
		company.departments.get(0).addEmployee("Amit");
		company.departments.get(1).addEmployee("Radha");
		company.showCompanyDetail();


		
	}

}
