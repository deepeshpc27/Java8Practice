//program to demonstrate increment of salary of those employees whose salary < = 10000


package com.demo.salaryIncrement;

public class Employee {

	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empno=" + empno + ", salary=" + salary + "]";
	}
	private String empname;
	private long empno;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empname, long empno, double salary) {
		super();
		this.empname = empname;
		this.empno = empno;
		this.salary = salary;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public long getEmpno() {
		return empno;
	}
	public void setEmpno(long empno) {
		this.empno = empno;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
}
