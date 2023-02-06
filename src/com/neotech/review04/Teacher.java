package com.neotech.review04;

public class Teacher {

	String name, subject;
	double salary;

	void teach() {
		System.out.println(name + " is teaching " + subject);
	}

	void yellAtStudent(String studentName) {
		System.out.println(name + " is yelling at " + studentName);
	}

}
