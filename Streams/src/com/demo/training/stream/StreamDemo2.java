//finding min and max value using stream
package com.demo.training.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String...args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(8);
		list.add(2);
		list.add(6);
		list.add(11);
		list.add(9);
		
		System.out.println("Elements of list: " + list);
		
		Comparator<Integer> c = Integer::compareTo;
	
		Integer min = list.stream().min(c).get();
		
		Integer max = list.stream().max(c).get();
		
		
		System.out.println("Min value: " + min + " and Max Value: " + max);
		
	//Using toArrayMethod of stream
		System.out.println("**********************");
		
		System.out.println("Using toArray Method to be applied on group of values:");
		
		Stream<Integer> s = Stream.of(9,99,999,99999,999999);
		s.forEach(System.out::println);
		
		System.out.println("***********************");
		
		System.out.println("Applying toArray method on array");
		
		Double [] arr = {9.0,9.1,9.2,9.3,9.4};
		Stream<Double> s1 = Stream.of(arr);
		s1.forEach(System.out::println);
	}
	
	
}
