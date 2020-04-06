package com.employeeMgmt;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Application {

	public static void main(String...args) {
		
	ArrayList<Employee> list = new ArrayList<Employee>();
	EmployeeManager e = new EmployeeManager();
	e.addEmployee(list);
//	System.out.println(list);
	
//	for (Employee employee : list) {
//		System.out.println("Ename: " + employee.getEmpname());
//	}
	System.out.println("Employee's data");
	list.forEach((emp)->{
		
		System.out.println("Emp name: " + emp.getEmpname() + ", " +  "Designation: " + emp.getDesignation() + ", " + "Salary: "+ emp.getSalary() + ", " + "City: " + emp.getCity());
	});

	
	
	Scanner sc = new Scanner(System.in);
	Predicate<Employee> p = null;
	
	String cont = "y";
	while("y".equalsIgnoreCase(cont)) {
	
	System.out.println("*****************************************");
	System.out.println("Search employees by category: ");
	System.out.println("1. Name");
	System.out.println("2. Designation");
	System.out.println("3. Salary");
	System.out.println("4. City");
	System.out.println("*****************************************");
	
	System.out.println("Filter by: ");
	int choice = sc.nextInt();
	
	
	switch(choice) {
	
	case 1:
		System.out.println("Enter name to search: ");
		String name = sc.next();
		p = emp -> emp.getEmpname().equalsIgnoreCase(name);
		e.display(p, list);
		
		break;
		
	case 2:
		System.out.println("Enter to search by designation: ");
		String designation = sc.next();
		p = emp -> emp.getDesignation().equalsIgnoreCase(designation);
		e.display(p, list);
		
		break;
		
	case 3:
		System.out.println("Enter to search by salary: ");
		Double salary = sc.nextDouble();
		p = emp -> emp.getSalary() == salary;
		e.display(p, list);
		
		break;
		
	case 4:
		System.out.println("Enter to search by city: ");
		String city = sc.next();
		p = emp -> emp.getCity().equalsIgnoreCase(city);
		e.display(p, list);	
	
	}	
	System.out.println("Do you want to continue? (Y/N)");	
	cont = sc.next();
	}	
}
}
