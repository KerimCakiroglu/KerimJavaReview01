package com.neotech.interview;

public class IQ4 {

	public static void main(String[] args) {

//		Find out how many alpha characters are present in a String? 
//		Find the number of words in a string?
//		How many letters in a String? No numbers, no special characters.

		String str = "dfg%DF3  ere @#67";

		str = str.replaceAll("[^A-Za-z]", "");

		System.out.println(str);

		System.out.println("Number of alpha characters = " + str.length());

		System.out.println("----------------");

		String longStr = "bye bye Java hello Selenium";

		String[] words = longStr.split(" ");
		System.out.println("Number of words in the string = " + words.length);

		System.out.println("---------------------");

		for (String el : words) {

			System.out.println(el);
		}

	}

}
