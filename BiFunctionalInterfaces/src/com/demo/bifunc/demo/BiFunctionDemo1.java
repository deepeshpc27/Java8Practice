package com.demo.bifunc.demo;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionDemo1 {

	private String name;
	private int rollno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public BiFunctionDemo1(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	public BiFunctionDemo1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		ArrayList<BiFunctionDemo1> list = new ArrayList<BiFunctionDemo1>();
		
		BiFunction<String, Integer, BiFunctionDemo1> f = (name,rollno) -> new BiFunctionDemo1(name,rollno);
		
		list.add(f.apply("Deepesh", 49));
		list.add(f.apply("Chirag", 47));
		
		list.forEach(stu -> {
			System.out.println("Name: " + stu.getName() + " , Roll no: " + stu.getRollno());
		});
		
	}
	
	
}
