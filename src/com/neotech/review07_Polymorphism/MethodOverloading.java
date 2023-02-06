package com.neotech.review07_Polymorphism;

public class MethodOverloading {

	// Method signature = method name + parameters
	// access modifier is NOT part of Method signature
	// return type is NOT part of Method signature

	public static void main(String[] args) {

		MethodOverloading mo = new MethodOverloading();
		mo.methodOne("Dardan");

		mo.methodOne(4.5, 6);

		// Polymorphism
		// Method overloading
		// Compile time Polymorphism/early binding/static binding

	}

	public void methodOne() {

	}

	public void methodOne(int a) {

	}

	public void methodOne(String a) {

	}

	public void methodOne(int a, int b) {

	}

	public void methodOne(double a, double b) {

	}

	public void methodOne(double a, int b) {

	}

	public void methodOne(int a, double b) {

	}
}
