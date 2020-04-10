package com.demo.bifunc.demo;

import java.util.Scanner;
import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String...args) {
		
		BiPredicate<Integer, Integer> p = (a,b) ->
					(a+b) % 2 == 0;

					int a,b,c=0;
					
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter first number");
					a = sc.nextInt();
					System.out.println("Enter second number");
					b = sc.nextInt();
					
					c = a + b;
	if(p.test(a,b))
		System.out.println("even number :" +c );
	else
		System.out.println("odd number: " +c);
	

	
	}
	

	
}
