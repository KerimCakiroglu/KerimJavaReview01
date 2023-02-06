package com.neotech.review04;

public class School {

	public static void main(String[] args) {

		Student s1 = new Student();

		s1.name = "Ali";
		s1.studentNr = 12;

		Student s2 = new Student();
		s2.name = "Veli";
		s2.studentNr = 23;

		s1.sleep();
		s2.study();

		System.out.println("==================");

		Teacher t1 = new Teacher();
		t1.name = "Fatma";
		t1.subject = "Math";

		t1.teach();
		t1.yellAtStudent(s2.name);

	}

}
