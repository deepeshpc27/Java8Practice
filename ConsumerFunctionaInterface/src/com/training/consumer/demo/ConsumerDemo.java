package com.training.consumer.demo;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String...args) {
		
		Consumer<String> c = s-> System.out.println(s);
		c.accept("Deepesh");
		c.accept("Premchandani");
	}
	
}
