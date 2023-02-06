package com.neotech.review05;

public class FamilyDemo {

	public static void main(String[] args) {

		// I CAN access static/class variables before I create an object
		FamilyMember.lastName = "James";

		// I CANNOT access instance variables before I create an object
		// FamilyMembers.firstName = "LeBron";

		// I CAN access static/class methods before I create an object
		FamilyMember.printFamilyName();

		// I CANNOT access non-static method before I create an object
		// FamilyMembers.printFullName();

		System.out.println("--------------------------------");

		FamilyMember member1 = new FamilyMember();
		member1.firstName = "LeBron";
		member1.age = 37;

		FamilyMember member2 = new FamilyMember();
		member2.firstName = "Savannah";
		member2.age = 35;

		member1.printFullName();
		member2.printFullName();

		System.out.println("--------------------------------");
		System.out.println("They went to the court and changed their lastname!!!");

		// Static varibles CAN change
		FamilyMember.lastName = "Brown";
		member1.firstName = "King LeBron";

		member2.printFullName();
		member1.printFullName();

		// They had a baby
		FamilyMember baby = new FamilyMember();

		// Does this baby has a firstName?
		System.out.println("firstName-> " + baby.firstName);

		// Does this baby has a lastName?
		System.out.println("lastName-> " + FamilyMember.lastName);

	}

}
