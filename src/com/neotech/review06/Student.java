package com.neotech.review06;

public class Student {
	// instance varibales
	String name;
	int age;

	// static/class variable
	static String school;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public void displayStudentInfo() {
		System.out.println(
				"My name is " + this.name + " AND my age is " + this.age + " AND I study at " + Student.school);
	}

	public static void main(String[] args) {

		Student.school = "NeoTech";
		// we dont have default constructor
		// Student s1 = new Student ();

		Student s2 = new Student("Aykut", 15);
		s2.displayStudentInfo();

		Student s3 = new Student("Sema", 23);
		s3.displayStudentInfo();

	}

}
