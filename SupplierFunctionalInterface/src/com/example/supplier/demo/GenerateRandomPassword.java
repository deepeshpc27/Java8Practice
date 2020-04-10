//program to generate random password which consists lowercase, uppercase, digits and special characters

package com.example.supplier.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class GenerateRandomPassword {

	public static String getRandomPwd(int length, String password) {
		StringBuilder sb =  new StringBuilder(length);
		Random random = new Random();
		for(int i = 0 ; i< length ; i++) {
			
			int rndCharIndex = random.nextInt(password.length());
			char randChar = password.charAt(rndCharIndex);
			
			sb.append(randChar);
			
		}
		return sb.toString();
	}
	
	public static String shuffleString(String string) {
		
		List<String> letters = Arrays.asList(string.split(""));
		Collections.shuffle(letters);
		return letters.stream().collect(Collectors.joining());
	}
	
	
	public static void main(String [] args) {
		
		Supplier<String> s = ()  -> {
			
			String lowercase = "abcdefghijklmnopqrstuvwxyz";
			String uppercase = lowercase.toUpperCase();
			String numbers="0123456789";
			String others = "@$#[]!";
			String password = lowercase + uppercase + numbers + others;
			
			Random random = new Random();
			int length =0;
			length = 8 + random.nextInt(7);
			
			if(length < 1) throw new IllegalArgumentException();
			
			
			int l =0, u =0, n = 0, o =0;
			StringBuilder sb =  new StringBuilder(length);
			
			l = random.nextInt(length - 3) + 1;
			u = random.nextInt(length - l -2 ) + 1;
			n = random.nextInt(length - l - u -1) + 1;
			o = length - l - u - n;
			
			sb.append(getRandomPwd(l, lowercase));
			sb.append(getRandomPwd(u, uppercase));
			sb.append(getRandomPwd(n, numbers));
			sb.append(getRandomPwd(o, others));
			
//			System.out.println("Number of lower case:"+l);
//			System.out.println("Number of upper case:"+u);
//			System.out.println("Number of digits :"+n);
//			System.out.println("Number of special characters:"+o);

			
			String unshuffled = sb.toString();
			String shuffled = shuffleString(unshuffled);
			//System.out.println(shuffled.length());
			return shuffled;
		};
		
		
		
		int i =0;
		while( i < 5) {
			String res = s.get();
			System.out.println("Password generated: " + res + " (Password length: " + res.length() +")");
			i++;
		}
	}
	
}
