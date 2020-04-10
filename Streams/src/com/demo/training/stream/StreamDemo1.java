//filtering out the string whose length is >= 9

package com.demo.training.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {

	public static void main(String...args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Deepesh Premchandani");
		list.add("Deepu");
		list.add("Hello How are you?");
		list.add("Yay");
		list.add("hahahahahaha");
		
		//using filter
		List<String> l = list.stream().filter(s-> s.length()>=9).collect(Collectors.toList());
		long count = list.stream().filter(s->s.length()>=9).count();
		System.out.println("There are " + count+ " Strings with length greater than 9:");
		l.forEach(System.out::println);
		
		
		System.out.println("*************************");
		
		//converting the existing strings into uppercase using map
		List<String> l1 = list.stream().map(s-> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("Strings in upper case");
		l1.forEach(System.out::println);
		
		
	}
	
}
