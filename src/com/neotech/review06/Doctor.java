package com.neotech.review06;

public class Doctor {

	// OOP --> Object Oriented Programming
	// 1. Inheritence(trashegimi, miras, herencia, nasledsrvo)

	String name;
	int salary;
	String licenceId;

// It is a good practise using default constructor
	Doctor() {

	}

	Doctor(String name, int salary, String licenceId) {
		this.name = name;
		this.salary = salary;
		this.licenceId = licenceId;
	}

	public void CheckUp(String patientName) {
		System.out.println("Doctor " + name + " makes a checkup on " + patientName);
	}

}
