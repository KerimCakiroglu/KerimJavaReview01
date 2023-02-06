package com.neotech.review09;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	// Map
	// HashMap | LinkedHashMap | TreeMap | HashTable

	public static void main(String[] args) {

		Map<Integer, String> phoneBook = new HashMap<>();

		phoneBook.put(123456789, "James Smith");
		phoneBook.put(234567890, "Julia Roberts");
		phoneBook.put(456789123, "Donald Trump");
		phoneBook.put(111111111, "Obama");
		phoneBook.put(7777777, "Cristiano Ronaldo");

		phoneBook.replace(234567890, "Ahmet");

		System.out.println(phoneBook);

		// Another way to replace

		phoneBook.put(123456789, "Sedat");

		System.out.println(phoneBook);

		// Map is one directioal, from key to value

		String name = phoneBook.get(123456789);
		// get the value by using the key
		System.out.println(name + " is calling...");

		name = phoneBook.get(666);
		System.out.println(name + " is calling...");

		boolean containsV = phoneBook.containsValue("Obama");
		System.out.println("Obama is in my phone book --> " + containsV);

		phoneBook.remove(456789123);
		System.out.println(phoneBook);

		System.out.println("The size of my phoneBook is --> " + phoneBook.size());

		System.out.println("-----phoneBook.keySet()----------");
//lets get all keys and store them in a set

		Set<Integer> numbers = phoneBook.keySet();
		System.out.println(numbers);

		Iterator<Integer> itNumbers = numbers.iterator();

		while (itNumbers.hasNext()) {
			Integer number = itNumbers.next();
			// Find the name/ value by using the number/key
			String personName = phoneBook.get(number);

			System.out.println(number + " -> " + personName);
		}

		System.out.println("------phoneBook.values()--------");

		// Task
		// Get the values and iterate them using an enhanced for loop
		// Try to get number by using the name!!!

		Collection<String> names = phoneBook.values();

		System.out.println(names);

		for (String element : names) {
			System.out.println(element);

			// Maps are one-directional, from key to value
			// phoneBook.get(element);

		}

	}

}
