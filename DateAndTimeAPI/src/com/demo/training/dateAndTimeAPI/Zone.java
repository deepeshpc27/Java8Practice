//program to implement ZoneId and ZonedDateTime

package com.demo.training.dateAndTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Zone {

	public static void main(String...args) {
		
		ZoneId zone = ZoneId.systemDefault();
		System.out.println("The Zone is" +zone);
		
		System.out.println("*********************");
		
		System.out.println("Displaying time of different zone");
		
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime dt = ZonedDateTime.now(la);
		System.out.println(dt);
		
		ZoneId ny = ZoneId.of("America/New_York");
		ZonedDateTime dt1 = ZonedDateTime.now(ny);
		System.out.println(dt1);
		
		ZoneId sy = ZoneId.of("Australia/Sydney");
		ZonedDateTime dt2 = ZonedDateTime.now(sy);
		System.out.println(dt2);
	}
	
	
}
