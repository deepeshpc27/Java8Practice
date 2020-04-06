package com.training.example.demo;

import java.util.TreeMap;

public class SortingTreeMap {

	public static void main(String...args) {
		
		TreeMap<Integer, String> t = new TreeMap<Integer, String>((I1,I2) -> (I1>I2)?-1:(I1<I2)?1:0);
		
		t.put(100, "Sunny");
		t.put(600,"Honey");
		t.put(200, "Bunny");
		t.put(500, "Deepu");
		
		System.out.println("Elements: " +t);
		
	}
	
}
