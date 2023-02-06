package com.neotech.interview;

public class IQ5 {

	public static void main(String[] args) {

//	Write a java program to reverse a String? 
//	Reverse a string word by word?
//	1. Neotech -> hcetoeN
//	2. I love Java very much -> 
//	much very Java love I

		// 1 way
		String str = "NeoTech";
		System.out.println("reversed str ---> " + reverseOne(str));
//2nd way
		System.out.println("reversed str --- > " + reverseTwo(str));

//3rd way , using StringBuffer
		StringBuffer sb = new StringBuffer(str);
		sb.reverse(); // StringBuffer is mutable

		System.out.println("reverse string using StringBuffer --> " + sb);

		System.out.println("--------------");

		String longStr = "bye bye Java hello Selenium";

		System.out.println(longStr);

		String[] words = longStr.split(" ");

		String reversedStr = "";

		// start from the last element to the first one
		for (int i = words.length - 1; i >= 0; i--) {
			reversedStr += words[i] + " ";

		}
		System.out.println(reversedStr);

	}

	public static String reverseOne(String str) {

		// 1st way , using charAt()

		// Starting from last character to the forst one
		String reversedStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversedStr += str.charAt(i); // Get the char using index i

		}
		return reversedStr;

	}

	public static String reverseTwo(String str) {

		// 2nd way

		String reversedStr = "";
		char[] chArray = str.toCharArray();

		for (int i = chArray.length - 1; i >= 0; i--) {
			reversedStr += chArray[i]; // get the char from chArry using index i

		}
		return reversedStr;

	}
}
