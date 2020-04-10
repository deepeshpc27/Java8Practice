package com.demo.training.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingUsingStream {

	public static void main(String [] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(8);
		list.add(2);
		list.add(6);
		list.add(11);
		list.add(9);
		System.out.println("Before sorting: " +list);
		Comparator<Integer> c = Integer::compareTo;//using comparator to do customized sorting
		
		List<Integer> l = list.stream().sorted().collect(Collectors.toList());
		
		List<Integer> l1 = list.stream().sorted(c.reversed()).collect(Collectors.toList());
		
		System.out.println("Ascending order sorting:" +l);
		System.out.println("Descending order: "+l1);
	} 
	
}
