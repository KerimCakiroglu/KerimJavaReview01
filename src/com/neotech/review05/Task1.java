package com.neotech.review05;

public class Task1 {

	public static void main(String[] args) {

		String longStr = "I am very happy today, because today is not Monday";

		// Task: Print the whole array, but replace 'a' with 'e'
		// Don't use replace/replaceAll method

		char[] charArray = longStr.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'a') {
				charArray[i] = 'e';
			}
		}
		for (char c : charArray) {
			System.out.print(c);
		}

	}

}
