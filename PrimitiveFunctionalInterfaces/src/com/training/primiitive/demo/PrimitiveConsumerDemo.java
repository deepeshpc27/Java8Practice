package com.training.primiitive.demo;

import java.util.function.IntConsumer;

public class PrimitiveConsumerDemo {

	public static void main(String [] args){
		
		IntConsumer c = i -> System.out.println(i*i);
		
		c.accept(10);
	}
	
}
