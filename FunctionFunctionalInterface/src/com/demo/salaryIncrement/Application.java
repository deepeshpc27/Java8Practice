package com.demo.salaryIncrement;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		ArrayList<Employee> list2 = new ArrayList<Employee>();
		IncrementSalary inc = new IncrementSalary();
		
		System.out.println("Before Increment:");
		inc.addEmployees(list);
		list.forEach(emp -> {
			System.out.println("Employee Name: " +emp.getEmpname()  + ", Emp ID: " + emp.getEmpno() + ", Salary: " + emp.getSalary());
		});
		
		System.out.println("After Increment:");
		inc.Increment(list,list2);
		list.forEach(emp -> {
			System.out.println("Employee Name: " +emp.getEmpname()  + ", Emp ID: " + emp.getEmpno() + ", Salary: " + emp.getSalary());
		});
		
		
		System.out.println("Employees who got increment:");
		list2.forEach(emp-> {
			System.out.println("Employee Name: " +emp.getEmpname()  + ", Emp ID: " + emp.getEmpno() + ", Salary: " + emp.getSalary());
		});
	}

}
