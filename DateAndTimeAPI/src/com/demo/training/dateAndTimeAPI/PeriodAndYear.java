package com.demo.training.dateAndTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.util.Scanner;

public class PeriodAndYear {

	public static void main(String[] args) {
		
		System.out.println("*****************************");
		System.out.println("Displaying Period:");
		LocalDate dob = LocalDate.of(1996, Month.SEPTEMBER,27);
		System.out.println("DOB: " + dob);
		
		LocalDate d = LocalDate.now();
		System.out.println("Todays Date: " +d);
		
		Period p = Period.between(dob, d);
		System.out.printf("Period: %d Years,%d Months,%d Days" ,p.getYears(),p.getMonths(),p.getDays());
		System.out.println();
		System.out.println("OR");
		int d2 = p.getYears()*365+p.getMonths()*30+p.getDays();
		System.out.printf("Period in days: %d days \n" ,d2);
		System.out.println("******************************");
	
		
		System.out.println("To check whether the given year is leap year or not!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the year to check");
		int year = sc.nextInt();
		
		Year y = Year.of(year);
		if(y.isLeap())
			System.out.println(year + " is a Leap Year");
		else
			System.out.println(year + " is not a Leap Year");
		
	}

}
