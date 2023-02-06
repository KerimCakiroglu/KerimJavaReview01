package com.neotech.interview;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class IQ8 {

	public static void main(String[] args) {

		// How can we remove all duplicates from ArrayList ?
		// You can create a new ArrayList and add the values one by one,
		// checking if the object exists or not.
		// You can also use a Set.

		List<String> names = new ArrayList<>();

		names.add("Emine");
		names.add("Mehpare");
		names.add("Noza");
		names.add("Mehpare");

		names.add("Deyo");
		names.add("Natalia");

		// This will add all the list elements into the newly created set
		Set<String> set = new LinkedHashSet<>(names);

		// this will remove all elements from the list
		names.clear();

		// This will add all the elements from the set to the list
		names.addAll(set);

		System.out.println(names);

		System.out.println("===============");

		List<String> names2 = new ArrayList<>();

		names2.add("Emine");
		names2.add("Mehpare");
		names2.add("Noza");
		names2.add("Mehpare");

		names2.add("Deyo");
		names2.add("Natalia");

		// we create an empty list
		List<String> names3 = new ArrayList<>();

		for (String name : names2) {
			// add the element if it is not already in the list
			if (!names3.contains(name)) {
				names3.add(name);
			}
		}
		System.out.println(names3);
	}

}
