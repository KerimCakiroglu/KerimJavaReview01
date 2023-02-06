package com.neotech.review04;

public class MethodsWithReturn {

	public static void main(String[] args) {

		String name = "Dardan";
		name.length();

		int numOfChars = name.length();
		System.out.println("The length of " + name + " is " + numOfChars);

		MethodsWithReturn m = new MethodsWithReturn();
		boolean res = m.isOdd(598484);
		System.out.println(res);

	}

	boolean isOdd(int num) {
		boolean result;
		if (num % 2 == 1) {
			result = true;

		} else {
			result = false;
		}
		return result;
	}

	// If this one is confusing, NO problem :)
	boolean isOddEnhanced(int num) {
		return num % 2 == 1;
	}
}
