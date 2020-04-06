package com.demo.student;

import java.util.ArrayList;
import java.util.function.Function;

public class ManageStudents {

	public void addStudents(ArrayList<Student> list) {
		list.add(new Student("Deepesh", 95,  "Chemistry"));
		list.add(new Student("Deepesh", 87,  "Mathematics"));
		list.add(new Student("Deepesh", 74,  "Physics"));
		list.add(new Student("Deepesh", 71,  "English"));
		list.add(new Student("Deepesh", 85, "Physical Education"));
		
	}

	public void displayGrade(ArrayList<Student> list) {
		
		Function<Student, String> f = s-> {
			
			double marks = s.getMarks();
			
			if(marks>= 90) {
				return "A+";
			}
			else if(marks>=80 && marks < 90) {
				return "A"; 
			}
			else if(marks>=70 && marks <80) {
				return "B+";
			}
			else if(marks>=60 && marks <70) {
				return "B";
			}
			else if(marks>=50 && marks <60) {
				return "C+";
			}
			else if(marks>=40 && marks <50) {
				return "C";
			}
			else if(marks>=35 && marks <40) {
				return "D";
			}
			else {
				return "E";
			}
			
		};
		
		list.forEach(stu ->{
			System.out.println("Student Name: " +stu.getName() + ", Marks: " +stu.getMarks() + ", Grade: " + f.apply(stu) + ", Subject: " + stu.getSubject());
	
		});
	
		double totalMarks = 0;
		for(Student m : list) {
			totalMarks += m.getMarks();
		}
		
		System.out.println("Total Marks: "+ totalMarks);
		
		System.out.println("Percentage obtained: "+ (totalMarks/500) *100 +"%");
		
	}
}
