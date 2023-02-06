package com.neotech.review06;

public class Multiplication {

	public static void multiply(int num1, int num2) {
		int result = num1 * num2;
		System.out.println(result);
	}

	public static void multiply(int num1, int num2, int num3) {
		System.out.println(num1 * num2 * num3);
	}

	public static void multiply(double d1, double d2) {
		double result = d1 * d2;
		System.out.println(result);
	}

	// Task
	public static void multiply(int[] numbers) {
		int result = 1;
		for (int num : numbers) {
			result *= num;
		}
		System.out.println(result);
	}

	public static void main(String[] args) {

		Multiplication.multiply(5, 2); // we dont need to specify the class name
		multiply(3, 4, 5);
		multiply(4.0, 1.5);
		// Task
		int[] array = { 5, 2, 3, 4 };
		multiply(array);

	}

}
