package com.neotech.review06;

public class World {

	public static void main(String[] args) {

		Person p1 = new Person();

		p1.displayInfo();
		p1.name = "Murad";
		p1.age = 25;
		p1.weight = 200;

		p1.displayInfo();

		System.out.println("-----------");

		Person p2 = new Person("Volkan", 32);

		p2.displayInfo();

		p2.weight = 160;
		p2.displayInfo();

		System.out.println("=========");

		Person p3 = new Person("Kerim", 35, 160);

		p3.displayInfo();

	}

}
