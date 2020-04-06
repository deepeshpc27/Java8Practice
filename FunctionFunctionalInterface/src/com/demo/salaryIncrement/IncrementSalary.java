package com.demo.salaryIncrement;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class IncrementSalary {

	//double incSalary = 0;
	public void addEmployees(ArrayList<Employee> list) {
		
		list.add(new Employee("Deepesh", 101, 9000));
		list.add(new Employee("Swati", 102, 20000));
		list.add(new Employee("Punit", 103, 15000));
		list.add(new Employee("Jaspreet", 104, 8000));
		list.add(new Employee("Yash", 105, 8500));
	
	}
	
	public void Increment(ArrayList<Employee> list, ArrayList<Employee> list2) {
		
	
		
		Predicate<Employee> p = e -> e.getSalary() <= 10000;
		
		
		Function<Employee, Employee> f = e -> {
			e.setSalary(e.getSalary() + 1000);
			//incSalary = e.getSalary() + 1000;
			return e;
		};
	
		for(Employee e : list) {
			if(p.test(e)) {
				list2.add(f.apply(e));
			}
			
		}
		
		
	}
	
	
}
