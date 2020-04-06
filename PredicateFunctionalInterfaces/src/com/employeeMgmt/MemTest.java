package com.employeeMgmt;

import java.util.ArrayList;

public class MemTest {

	public static void main(String[] args) {
		
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (long i = 0; i < 80000000000L; i++) {
			
			arrayList.add(new Employee());
			/*
			 * if(i==10000000000L) { arrayList = null; }
			 */
			//new Employee();
		}

	}

}
