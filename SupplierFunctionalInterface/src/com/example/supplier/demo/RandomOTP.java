//program to generate random OTP

package com.example.supplier.demo;

import java.util.Random;
import java.util.function.Supplier;

public class RandomOTP {
public static void main(String...args) {
	Supplier<String> s = () -> {

					return String.format("%06d", new Random().nextInt(1000000));
					
 	};
 	System.out.println(s.get());
}
}
