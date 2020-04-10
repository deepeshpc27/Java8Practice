//program to display current date and time of system

package com.demo.training.dateAndTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Demo {

	public static void main(String...args) {
		
		LocalDate date = LocalDate.now();
		System.out.println("SystemDate: "+date);
		
		LocalTime time = LocalTime.now();
		System.out.println("Cuurent Time: "+time.format(DateTimeFormatter.ofPattern("hh:mm:ss a")));
		
		System.out.println("**************************");
		System.out.println("Displaying formatted date:");
		//formatting date 
		
		int dd= date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		
		System.out.println("Formatted Date: "+ dd+"/"+mm+ "/"+yyyy);
				
		
		System.out.printf("Formatted Date: %d-%d-%d", dd,mm,yyyy);
		System.out.println();
		System.out.println("**************************");

		System.out.println("Displaying formatted time:");
				
				int hours = time.getHour();
				int mins = time.getMinute();
				int sec = time.getSecond();
				int nsec = time.getNano();
				
		System.out.printf("Formatted Time: %d:%d:%d:%d" , hours,mins,sec,nsec);		
		System.out.println();
		System.out.println("**************************");
		System.out.println("Displaying date according to input given");
		LocalDateTime dob  = LocalDateTime.of(1996,Month.SEPTEMBER,27,16,00);
		System.out.println("My DOB:" +dob);
		System.out.println("After 6 months: "+ dob.plusMonths(6));
		
	}
	
}
