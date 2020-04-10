//program to get random names
package com.example.supplier.demo;

import java.util.function.Supplier;

public class SupplierDemo1 {
	
	public static void main(String...args) {
		
		Supplier<String> s = () -> {
			String [] s1 = {"Deepu", "Jaasi", "Chintu", "Sid"};
			int x = (int)(Math.random()*4);
					return s1[x];
		};
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
