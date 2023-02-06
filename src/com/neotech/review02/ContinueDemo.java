package com.neotech.review02;

public class ContinueDemo {

	public static void main(String[] args) {

		for (int age = 11; age < +20; age++) {
			if (age == 13) {
				continue;
			}
			System.out.println("Happy birtday! You are " + age + " years old.");

		}

//		{
//			if (age == 13) {
//				continue;
//			}
//			System.out.println("Happy birtday! You are " + age + " years old.");
//			age++;
//
//		} while (age <= 20) 

	}

}
