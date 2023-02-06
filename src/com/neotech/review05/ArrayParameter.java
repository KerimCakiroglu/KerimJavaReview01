package com.neotech.review05;

import java.util.Arrays;

public class ArrayParameter {

	public static void main(String[] args) {

		int[] array = { 7, 3, 5, 9, 8 };

		// To print one element with index 2
		// System.out.println(array[2]);

		// Print the array using Arrays.toString(array) method
		String str = Arrays.toString(array);
		System.out.println(str);

		ArrayParameter ap = new ArrayParameter();

		int result = ap.largestNumber(array);
		System.out.println("The largest number in the array is -> " + result);

		result = ap.arraySum(array);
		System.out.println("The sum of the array is -->" + result);

		double d = ap.arrayAvg(array);
		System.out.println("The average of the array is ->" + d);

	}// Task3
		// Create method that will get an array of integers,
		// and return the average as a double
		// Make the method private

	private double arrayAvg(int[] arr) {

		double sum = 0;
		for (int el : arr) {
			sum += el;
		}
		double average = sum / arr.length;
		return average;

	}

	// Task2
	// Create a method that will get an array of integers,
	// and return the sum
	// Make the method protected

	protected int arraySum(int[] arr) {
		int sum = 0;
		for (int el : arr) {
			sum += el;
		}
		return sum;
	}

	public int largestNumber(int[] arr) {
		int largest = arr[0];

		for (int el : arr) {
			if (el > largest) {
				largest = el;
			}
		}

		return largest;
	}

}
