package com.training.primiitive.demo;

import java.util.function.IntPredicate;

public class IntPredicateDemo {

	public static void main(String [] args) {
		
		int [] x = {0,3,6,8,13,16,9};
		
		IntPredicate p = i -> i%2==0;
		
		for(int x1: x){
			if(p.test(x1))
				System.out.println(x1);
		}
		
	}
	
	
}
