package com.training.consumer.demo;

import java.util.function.Consumer;

public class ChainedConsumer {

	private String name;
	private String result;
	public ChainedConsumer(String name, String result) {
		super();
		this.name = name;
		this.result = result;
	}
	public ChainedConsumer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	
	public static void main(String...args) {
		
		Consumer<ChainedConsumer> c1 = m -> System.out.println("Movie: " + m.getName() + " is ready to release");
		Consumer<ChainedConsumer> c2 = m -> System.out.println("Movie: " + m.getName() + " is just released and is a " + m.getResult()  );
		Consumer<ChainedConsumer> c3 = m -> System.out.println("Movie: " + m.getName() + " information is now being stored in database");
		
		
		Consumer<ChainedConsumer> chained = c1.andThen(c2).andThen(c3);

		ChainedConsumer cc = new ChainedConsumer("Bahubali", "hit");
		chained.accept(cc);
	}
	
	
}
