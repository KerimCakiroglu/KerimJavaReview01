package com.neotech.review06;

public class Person {

	public String name;
	int age;
	protected int weight;

	public Person() {
		System.out.println("Creating a person");
	}

	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;

	}

	public Person(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public void displayInfo() {
		System.out.println("Name: " + name + " age: " + age + " weight: " + weight);
	}

}
