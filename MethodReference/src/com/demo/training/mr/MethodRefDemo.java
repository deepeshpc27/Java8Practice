package com.demo.training.mr;

@FunctionalInterface
interface MyInterface{
	
	public void display();
}


public class MethodRefDemo {

	
	public  void mr() {
		System.out.println("Implementation of Method Reference instance method");
	}
	
	public static void d() {
		System.out.println("Implementation of Method Ref static method");
	}
	
	public static void main(String...args) {
		
		MethodRefDemo m = new MethodRefDemo();
		MyInterface i = m :: mr;
		MyInterface i1 = MethodRefDemo :: d;
		i.display();
		i1.display();
	}
	
	
	
}
