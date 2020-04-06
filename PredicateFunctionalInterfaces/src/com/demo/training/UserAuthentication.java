//validate user using predicate 

package com.demo.training;

import java.util.Scanner;
import java.util.function.Predicate;

 public class UserAuthentication {

	
	
	private String username;
	private String password;
	
	public UserAuthentication(String username,String password) {
		this.username = username;
		this.password = password;
	}
	
	
	
	public static void main(String...args) {
			Predicate<UserAuthentication> p = u -> u.username.equals("deepu") && u.password.equals("hello123");
			Scanner sc = new Scanner(System.in);
	
			System.out.println("Enter username");
			String username = sc.next();
			
			System.out.println("Enter password");
			String password = sc.next();
			
			UserAuthentication user  = new UserAuthentication(username, password);
			
			if(p.test(user)) {
				System.out.println("Valid user");
			}
			else
				System.out.println("Invalid user");
	}
	
}
