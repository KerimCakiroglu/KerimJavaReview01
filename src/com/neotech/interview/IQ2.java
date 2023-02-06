package com.neotech.interview;

public class IQ2 {

	public static void main(String[] args) {

		// Write a java program to check whether a given number is prime or not?
		// Check if a number is divisible by any of smaller numbers.
		// Use the mod operator.

		// prime number is divisible only by 1 and itself
		// Number 1 is NOT prime

		int number = 35; // not prime, divisible by 1, 5, 7, 35

		boolean prime = true;

		if (number == 1) {

			prime = false;
		} else {

			for (int i = 2; i < number / 2; i++) {

				if (number % i == 0) {

					System.out.println(number + " is divisible by " + i);

					prime = false;
					break;
				} else {
					System.out.println(number + " is NOT divisible by " + i);
				}
			}

		}
		System.out.println("------------------");
		System.out.println(number + " is prime ? " + prime);
	}

}
