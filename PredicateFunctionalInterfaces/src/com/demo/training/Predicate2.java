//checking names starting with k using predicate

package com.demo.training;

import java.util.function.Predicate;

public class Predicate2 {

	public static void main(String...args) {
		
		String [] names = {"Kajol","Shyam","Ketan","Deepu","Khushboo","Aman"};
		
		Predicate<String> startsWithK = s -> s.charAt(0) == 'K';
		
		for(String s:names) {
			
			if(startsWithK.test(s)) {
				System.out.println(s);
			}
		}
	}
	
}
