package com.neotech.review06;

public class HospitalApplication {

	public static void main(String[] args) {
		Doctor d1 = new Doctor("Karen", 170, "D123");

		d1.CheckUp("Emine");

		// These are variables and methods of the child class
		// d1.dermId ="X";
		// d1.applySkinTreatment();

		Dermatologist d2 = new Dermatologist();
		d2.name = "Alex";
		d2.salary = 500000;
		d2.licenceId = "D555";
		d2.dermID = "X987";

		d2.CheckUp("Dardan");
		d2.applySkinTreatment();

		System.out.println("--------------");

		Dermatologist d3 = new Dermatologist("Kenan", 190000, "D482");
		d3.dermID = "X284";
		d3.salary = 210000; // we are re-assiging the salary
		d3.applySkinTreatment();

		System.out.println("-----------");
		Dermatologist d4 = new Dermatologist("Jennifer", 35000, "D195", "X951");
		d4.CheckUp("Emine");
		d4.applySkinTreatment();

	}

}
