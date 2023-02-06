package com.neotech.review08;

public class PhoneDemo {

	public static void main(String[] args) {

		Phone p = new Phone("S1234", "Samsung", "pass@123");
		System.out.println();
		p.displayInfo();

		String serial = p.getSerialNumber("pass@123");
		System.out.println("The serial number is " + serial);

		p.setSerialNumber("Sam1234");
		p.displayInfo();

		System.out.println(p.getSerialNumber("pass@123"));

		System.out.println("-----------------");

		String phoneBrand = p.getBrand();
		System.out.println("The brand is " + phoneBrand);

		// I cannot change the brand
		// Because there is NO setter method
		// p.setBrand("Apple");

	}
}
