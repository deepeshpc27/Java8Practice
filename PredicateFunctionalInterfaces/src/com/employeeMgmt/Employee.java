package com.employeeMgmt;

public class Employee {

	private String empname;
	private String designation;
	private double salary;
	private String city;
		
	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empname, String designation, double salary, String city) {
		super();
		this.empname = empname;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee: [empname=" + empname + ", designation=" + designation + ", salary=" + salary
				+ ", city=" + city + "]";
	}

	

}
