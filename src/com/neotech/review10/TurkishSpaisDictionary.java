package com.neotech.review10;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TurkishSpaisDictionary {

	public static void main(String[] args) {

		Map<String, String> dictionary = new TreeMap<>();

		dictionary.put("ev", "casa");
		dictionary.put("kedi", "gato");
		dictionary.put("esek", "burro");
		dictionary.put("bayrak", "bandera");
		dictionary.put("carsaf", "bandera");
		// dictionary.put("carsaf", "sabana"); // overwrite

		System.out.println(dictionary);

		// Set --> No duplicates
		// List --> Insertion order is preserved

		Set<String> turkishWords = dictionary.keySet();
		System.out.println("keys---> " + turkishWords);

		Collection<String> spanishWords = dictionary.values();
		System.out.println("values ---> " + spanishWords);

		Set<Entry<String, String>> entries = dictionary.entrySet();

		System.out.println("entries ---> " + entries);

		System.out.println("-----------------");

		// enchanced/advanced/for-ach loop
		for (Entry<String, String> pair : entries) {
			String K = pair.getKey();
			String V = pair.getValue();
			System.out.println(K + " -> " + V);
		}
		System.out.println("==============");

		// Iterate the Entries and print by using iterator
		Iterator<Entry<String, String>> it = entries.iterator();

		while (it.hasNext()) {

			Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
			System.out.println(entry.getKey() + " ==> " + entry.getValue());

		}
		System.out.println("------2nd------");

		Iterator<Entry<String, String>> it2 = entries.iterator();

		while (it2.hasNext()) {
			Entry<String, String> pair = it2.next();
			System.out.println(pair.getKey() + " : " + pair.getValue());

		}

	}

}
