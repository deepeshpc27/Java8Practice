package com.training.example.demo;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

	public static void main(String...args) {
	
	ArrayList<Integer> l = new ArrayList<Integer>();
	
	l.add(10);
	l.add(0);
	l.add(15);
	l.add(5);
	l.add(20);
	
	System.out.println("Elements before sorting: " +l);
	
	//Collections.sort(l); //Ascending order sorting
	//Collections.sort(l, new MyComparator()); //Customized sorting Descending order
	
	//Using lambda expression
	Collections.sort(l, (I1,I2) -> (I1>I2)?-1:(I1<I2)?1:0);
	
	System.out.println("Elements after sorting: " +l);
	//l.forEach(System.out::println);

	}
	
}
