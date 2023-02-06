package com.neotech.review08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionIntro {

	public static void main(String[] args) {

		// List is an Interface
		// List<String> names = new List<>();

		List<String> africa = new ArrayList<>(); // Up-Casting
		africa.add("Kenya");
		africa.add("Morocco");
		africa.add("Chad");
		africa.add(1, "Ghana"); // Adding into the list with an index

		System.out.println(africa);

		// 2nd way of filling an ArrayList
		List<String> africa2 = new ArrayList<>();

		africa2.addAll(africa);
		System.out.println(africa2);

		// 3rd way of filling an ArrayList
		List<String> africa3 = new ArrayList<>(africa); // Creating a filled list
		System.out.println(africa3);

		System.out.println("--------------------------------");
		// There are 3 ways to iterate a list
		for (int i = 0; i < africa.size(); i++) {
			String country = africa.get(i);
			System.out.print(country + " ");
		}
		System.out.println();

		for (String country : africa) {
			System.out.print(country + " ");
		}
		System.out.println();

		System.out.println("----Using Iterator----");
		Iterator<String> iterator = africa.iterator();

		while (iterator.hasNext()) {
			String country = iterator.next();
			System.out.print(country + " ");
		}
		System.out.println();

		System.out.println("--------------------------------");

		// ArrayList<Object> list = new ArrayList<>(); // Same as Non-Generic

		ArrayList europe = new ArrayList(); // Non-Generic
		europe.add("Italy");
		europe.add(4);
		europe.add(4.5);
		europe.add(true);

		for (Object element : europe) {
			System.out.println(element);
		}

	}
}
