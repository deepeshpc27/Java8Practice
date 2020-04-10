package com.training.primiitive.demo;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class PrimitiveFunctionDemo {

	public static void main(String...args) {
		
		IntFunction<Integer> f = i -> i*i;
		System.out.println(f.apply(5));
	
		ToIntFunction<String> t = s->s.length();
		System.out.println(t.applyAsInt("Hello"));
		
		IntToDoubleFunction f1 = i -> Math.sqrt(i);
		System.out.println(f1.applyAsDouble(100));
		
		
	}
	
}
