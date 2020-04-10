package com.demo.training.mr;

interface MyInterface1{
	
	MethodRefCons display();
}

public class MethodRefCons {

	
	public MethodRefCons() {
		System.out.println("Reference to a constructor ");
	}
	
	public static void main(String[]args) {
	
	MyInterface1 i = MethodRefCons::new;
	i.display();
	}
}
