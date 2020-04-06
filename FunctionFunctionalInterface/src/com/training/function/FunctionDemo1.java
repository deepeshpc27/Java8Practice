//program to remove spaces present in the given string

package com.training.function;

import java.util.function.Function;

public class FunctionDemo1 {

	public static void main(String...args) {
		
		String string = "Hello how are you doing?";
		
		Function<String, String> f = s -> s.replaceAll(" ", "");
		
		System.out.println(f.apply(string));
		
		//to count number of spaces in the given string
		Function<String, Integer> f1 = s ->s.length() - s.replaceAll(" ", "").length();
		System.out.println("The number of spaces in the string: " + f1.apply(string));
		
		
	}
	
	
}
