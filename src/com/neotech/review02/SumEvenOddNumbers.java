package com.neotech.review02;

public class SumEvenOddNumbers {

	public static void main(String[] args) {

		// Add Even numbers
		// Also add Odd numbers
		// Also add All numbers
		// Between 1 && 50
		// Using for loop

		int total = 0;
		int oddTotal = 0;
		int evenTotal = 0;

//		for (int i = 1; i <= 50; i++) {
//
//			if (i % 2 == 0) {// even
//				evenTotal += i;
//			} else {
//				oddTotal += i;
//			}
//
//			total += i;
//
//		}
//		System.out.println("The sum of even numbers --> " + evenTotal);
//		System.out.println("The sum of odd numbers --> " + oddTotal);
//		System.out.println("The sum of all numbers --> " + total);

		System.out.println("------- Smarter Way -----");

		for (int i = 1; i <= 50; i++) {

			if (i % 2 == 0) {
				evenTotal += i;
			} else {
				oddTotal += i;

			}

		}

		System.out.println("The sum of even numbers --> " + evenTotal);
		System.out.println("The sum of odd numbers --> " + oddTotal);
		System.out.println("The sum of all numbers --> " + (oddTotal + evenTotal));

	}

}
