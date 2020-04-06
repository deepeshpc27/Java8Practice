//using predicate to remove null values and empty strings from a given list

package com.demo.training;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicate3 {

	public static void main(String...args) {
		
		String [] names = {"Deepu", null, "", "Peepu", "Gaurav"};
		
		Predicate<String> p = s -> s!=null && s.length()!=0;
		
		ArrayList<String> l = new ArrayList<String>();
		
		for(String s: names)
		{
			if(p.test(s))
			{
				l.add(s);
			}
		}
		
		System.out.println("List of valid strings: " +l);
		
		
	}
	
	
}
