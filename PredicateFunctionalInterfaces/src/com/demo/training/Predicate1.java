package com.demo.training;


import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Predicate1 {

	public static void main(String...args) {
		
		Predicate<Collection> p = c -> c.isEmpty();
		
		ArrayList l1 = new ArrayList();
		l1.add("Yo");
		System.out.println(p.test(l1)); //returns false
		
		
		ArrayList l2 = new ArrayList();
		System.out.println(p.test(l2)); //returns true because array list l2 is empty!
		
		
		
		
		
	}
	
}
