package com.employeeMgmt;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeManager {

	public void addEmployee(ArrayList<Employee> list) {
		
		list.add(new Employee("Deepesh","Associate Tech",30000,"Pune"));
		list.add(new Employee("Khushboo","Associate Tech",40000,"Pune"));
		list.add(new Employee("Gajendra","Associate Programer",30000,"Indore"));
		list.add(new Employee("Deepu","Manager",100000,"Pune"));
		list.add(new Employee("Neha","Lead",70000,"Bengaluru"));
		list.add(new Employee("Sudheer","Prod Support",35000,"Pune"));
		list.add(new Employee("ABC","Sr. Manager",200000,"Pune"));
		
		
	}
	
	public void display(Predicate<Employee> p, ArrayList<Employee> list)
	{
		
		for(Employee e : list) {
			if(p.test(e)) {
				System.out.println(e);
			}
		}
		
	}
	
}
