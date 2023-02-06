package com.neotech.review08;

public class WrapperDemo {

	public static void main(String[] args) {

		int num1 = 6;

		// Integer integer1 = new Integer(num1); // until Java 1.8
		// Integer integer2 = Integer.valueOf(num1); // after Java 9 and up

		Integer integer1 = new Integer(num1); // Boxing/Wrapping
		int num2 = integer1.intValue(); // Unboxing/Unwrapping

		// Easy way
		int num3 = 9;
		Integer integer3 = num3; // Auto-Boxing,Auto-Wrapping, Auto-converting
		int num4 = integer3; // Auto-UnBoxing, Auto-UnWrapping, Auto-converting

		// Double wrapper
		double d1 = 4.8;
		Double d2 = d1; // Auto-Boxing
		Double d3 = 2.2; // Auto-Boxing
		double d4 = d3; // Auto-UnBoxing

		Boolean b1 = true; // Auto-Boxing

		Character c1 = 'G'; // Auto-Boxing

		// int -> Integer
		// byte -> Byte
		// short -> Short
		// long -> Long
		// float -> Float
		// double -> Double
		// boolean -> Boolean
		// char -> Character

	}

}
