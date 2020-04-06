package com.training.function;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String...args) {
		
		Function<Integer, Integer> f = i -> i*i;
		System.out.println(f.apply(5));
		
	}
	
	
}
