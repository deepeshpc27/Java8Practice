package com.demo.training.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list  = new ArrayList<Integer>();
		list.add(0);
		list.add(3);
		list.add(2);
		list.add(7);
		list.add(8);
		
		//filter out even numbers using stream
		List<Integer> l1 = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(l1);
		//using map
		List<Integer> l2 = list.stream().map(i -> i*2).collect(Collectors.toList());
		System.out.println(l2);
		
	}
	
}
