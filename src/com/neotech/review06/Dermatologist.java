package com.neotech.review06;

public class Dermatologist extends Doctor {

	String dermID;

	public Dermatologist() {
		// super();
		// implicitly it is calling the default constructor of the parent
	}

	// The constructors are NOT inherited
	public Dermatologist(String name, int salary, String licenceId) {
		super();
		super.name = name;
		super.salary = salary;
		super.licenceId = licenceId;
	}

	public Dermatologist(String name, int salary, String licenceId, String dermId) {
		super(name, salary, licenceId);
		this.dermID = dermId;

	}

	public void applySkinTreatment() {
		System.out.println("Doctor " + name + " applies skin treatment");
	}

}
