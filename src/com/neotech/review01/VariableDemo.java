package com.neotech.review01;

public class VariableDemo {

	public static void main(String[] args) {
		
		
		//declare a variable
		
		String firstName;
		//System.out.println("My first name is " + firstName);
		
		
		//Assign a value (initialize)
		firstName = "Cesur";
		System.out.println("My first name is " + firstName);
		
		
		// Declaring a variable & Assign a value
		String lastName = "Unsur";
		
		int age = 28;
		
		System.out.println(firstName + " "+ lastName + " " +age);
		
		System.out.println(firstName + " "+ lastName + " " +age+1);
		
		System.out.println(firstName + " "+ lastName + " " +(age+1));
		
		//re-assign a new value to the container
		//After 5 years
		//age = age +5; //long way
		age +=5; //short way
		lastName = "Aniston";
		
		System.out.println(firstName + " "+ lastName + " " +age);
		
		
		
		
		
		
		
		
		
		
	}

}
