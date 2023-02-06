package com.neotech.review10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {

		String projectPath = System.getProperty("user.dir");

		System.out.println(projectPath);

		String filePath = projectPath + "/extra/demo.properties";

		System.out.println(filePath);

		System.out.println("-------------");
		// fileIS will help me read the file
		FileInputStream fileIS = new FileInputStream(filePath);

		// proper is a Map(key-value pairs)
		Properties proper = new Properties();

		// load method will help me read from the file to the proper map
		proper.load(fileIS);

		System.out.println(proper);

		// 1way to get firstName
		Object firstName = proper.get("FirstName");
		System.out.println(firstName);

		// 2n way to correct way
		String school = proper.getProperty("School");
		System.out.println(school);

		String age = proper.getProperty("Age");
		System.out.println(age);

		// Add more key_>values pairs
		proper.setProperty("SSN", "647-21-9034");

		// Re-assign Age
		proper.setProperty("Age", "60");
		System.out.println(proper);

		// now let us save into a new file

		// Thepath to the new file
		String newPath = System.getProperty("user.dir") + "/extra/NewFile.txt";

		FileOutputStream fileOS = new FileOutputStream(newPath);

		proper.store(fileOS, "Dardan is waiting for us");

	}

}
