package com.neotech.review04;

public class World {

	public static void main(String[] args) {

		// declaring and initializing a variable
		Baby baby1 = new Baby();
		baby1.name = "Pedro";
		baby1.weight = 18;

		System.out.println("The name of the baby is " + baby1.name);
		System.out.println("The hair color baby1 is " + baby1.hairColor);
		baby1.hairColor = "Black";
		baby1.gender = 'M';

		System.out.println("The hair color baby1 is " + baby1.hairColor);

		System.out.println("-----------------------");

		// declaring a variable of type
		Baby baby2;

		// creating a baby and assigning it to the variable
		baby2 = new Baby();
		System.out.println("The name of baby2 is " + baby2.name);

		baby2.name = "Aykut";
		baby2.gender = 'A';
		baby2.weight = 7;
		baby2.hairColor = "Red";

		System.out.println("The name of baby2 is " + baby2.name);
		System.out.println("The hair color of baby2 is " + baby2.hairColor);

		System.out.println("---------------");

		baby1.cry();
		baby2.cry();

		baby1.talk();

		System.out.println("-----------------");

		baby1.displayInformation();
		baby2.displayInformation();
	}

}
