package com.neotech.review04;

public class Methods {

	void sayWelcome() {
		for (int i = 1; i <= 5; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();

	}

	void sayWelcomeWithNumber(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();
	}

	void sayGreeting(String greeting) {
		for (int i = 1; i <= 5; i++) {
			System.out.print(greeting + " ");
		}
		System.out.println();
	}

	// Create a method sayGreetingWithNumber that accepts
	// the greeting and how many times it should be printed
	void sayGreetingWithNumber(String greeting, int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(greeting + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Methods m = new Methods();

		m.sayWelcome();
		m.sayWelcomeWithNumber(3);
		m.sayGreeting("Hola");

		m.sayGreetingWithNumber("Salut", 2);
	}

}
