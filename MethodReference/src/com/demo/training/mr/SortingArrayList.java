package com.demo.training.mr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingArrayList {

	public static void main(String...args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Deepesh");
		list.add("Aman");
		list.add("Suraj");
		list.add("Darshan");
		list.add("Muskan");
		
		System.out.println("Elements before sorting: " + list);
		
		//sorting in descending order using method ref
		Comparator<String> comp = String::compareToIgnoreCase;
		Collections.sort(list, comp.reversed() );
		
		System.out.println("After sorting: " +list);
			
	}


}
