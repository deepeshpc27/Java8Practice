package com.demo.training.mr;

public class MethodRefDemo1 {

	public void method() {
		//child thread
		for(int i =0;i<5;i++) {
			System.out.println("Child thread");
		}
		
	}
	
	public static void main(String [] args) {
		MethodRefDemo1 m = new MethodRefDemo1();
		Runnable r = m :: method;
		
		Thread t = new Thread(r);
		t.start();
		//main thread
		for(int i = 0; i<5;i++ ) {
			System.out.println("Main Thread");
		}
		
	}
	
}
