package com.training.example.demo;

import java.util.ArrayList;
import java.util.Collections;

public class SortingOwnClassObject {

	
	public static void main(String...args) {
		
		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(new Employee(100,"Deepu"));
		e.add(new Employee(600,"Khushboo"));
		e.add(new Employee(300,"Jassi"));
		e.add(new Employee(700,"Aman"));
		e.add(new Employee(500,"Badu"));
		
		System.out.println("Before Sorting: " +e);
		
		Collections.sort(e, (e1,e2) -> (e1.getEno()>e2.getEno())?-1:(e1.getEno()<e2.getEno())?1:0 );
		System.out.println("After Sorting: " +e);
	}
	
}
