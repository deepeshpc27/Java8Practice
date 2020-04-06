package com.demo.student;

import java.util.ArrayList;

public class Application {

	public static void main(String...args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		ManageStudents mgstu = new ManageStudents();
		
		mgstu.addStudents(list);
		mgstu.displayGrade(list);
		
		
	}
	
	
}
