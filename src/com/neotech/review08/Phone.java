package com.neotech.review08;

public class Phone {

	private String serialNumber;
	private String brand;
	private String password;

	public Phone(String serialNumber, String brand, String password) {
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.password = password;

	}

	public void displayInfo() {
		System.out.println("This is a " + brand + " phone with serial number  " + serialNumber);
	}

	// getters and setters
	// I will give you serial Number
	// only if you provide password
	public String getSerialNumber(String password) {
		String result = "";
		if (this.password.equals(password)) {
			result = serialNumber;
		} else {
			result = "Access Denied!!";
		}
		return result;

	}

	// You will be able to change the serialNumber
	// only if it is 7 characters long

	public void setSerialNumber(String serialNumber) {

		if (serialNumber.length() == 7) {
			this.serialNumber = serialNumber;
		}

	}
	// Brand should be view ONLY

	public String getBrand() {
		return this.brand;
	}

}
