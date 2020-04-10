package com.training.function;

import java.util.function.Function;

public class FunctionChainingDemo {

	public static void main(String...args) {
		
		Function<String, String> f1 = s -> s.toUpperCase();
		Function<String, String> f2 = s -> s.substring(0, 9);
		
		System.out.println(f1.apply("deepesh premchandani"));
		System.out.println(f2.apply("deepesh premchandani"));
		System.out.println("Result of f1.andThen(f2):" +f1.andThen(f2).apply("deepesh premchandani"));
		System.out.println("Result of f1.compose(f2):" +f1.compose(f2).apply("deepesh premchandani"));
	}
	
}
