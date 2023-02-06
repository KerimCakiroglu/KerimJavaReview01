package com.neotech.review11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws FileNotFoundException {

		String projectPath = System.getProperty("user.dir");

		String filePath = projectPath + "/extra/democratic.properties";

		FileInputStream fis = new FileInputStream(filePath);

		System.out.println("Happy Ending!!!");

	}

}
