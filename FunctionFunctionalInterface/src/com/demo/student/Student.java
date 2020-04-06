//program to display grade of a student

package com.demo.student;


public class Student {

	private String name;
	private double marks;

	private String subject;
	
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public Student(String name, double marks, String subject) {
		super();
		this.name = name;
		this.marks = marks;
		this.subject = subject;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}


	
