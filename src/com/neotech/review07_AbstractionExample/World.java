package com.neotech.review07_AbstractionExample;

public class World {

	public static void main(String[] args) {

		// I cannot create on object from an abstract class
		// Human h1 = new Human("Melih");

		// Up-casting and down-casting can be done ONLY
		// because of INHERITANCE
		Human a1 = new Albanian("Valbona"); // up-casting
		a1.talk();
		a1.sleep();
		// a1.albanianDance();

		Human t1 = new Turkish("Vane"); // up-casting
		t1.talk();
		t1.sleep();
		// t1.makeBaklava();

		Turkish tur = (Turkish) t1; // down-casting
		tur.makeBaklava();

	}

}
