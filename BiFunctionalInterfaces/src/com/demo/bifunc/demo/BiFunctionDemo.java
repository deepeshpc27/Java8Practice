package com.demo.bifunc.demo;

import java.util.Scanner;
import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String [] args) {
		
			BiFunction<Integer, Integer, String> f =(a,b) -> {
				
				if(a>=0 && b <=50) {
					return "Good AQI";
				}	
					
				else if(a>=51 && b <=100) {
					return "Moderate AQI";
				}
				else if(a>= 101 && b <= 150)
				return "Unhealthy for sensitive groups";
				
				else if(a >= 151  && b <= 200 ) {
					return "Unhealthy AQI";
				}
				
				else if(a >= 201  && b <= 300 ) {
					return "Very Unhealthy AQI";
				}
				else  {
					return "Hazardous AQI";
				}
				
			}; 
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter AQI range: ");
			int c = sc.nextInt();
			int d = sc.nextInt();
			String res = f.apply(c, d);
			System.out.println(res);
		
	}
	
}
