package com.neotech.review09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class WorldMap {
	public static void main(String[] args) {

		Map<String, String> europe = new TreeMap<>();

		europe.put("Spain", "Madrid");
		europe.put("Germany", "Berlin");
		europe.put("Italy", "Rome");

		System.out.println(europe);

		Map<String, String> africa = new LinkedHashMap<>();
		africa.put("Morroco", "Rabat");
		africa.put("Egypt", "Cairo");
		africa.put("SouthAfrica", "Johannesburg");

		System.out.println(africa);

		Map<String, String> asia = new HashMap<>();
		asia.put("Japan", "Tokyo");
		asia.put("Iran", "Tehran");
		asia.put("Tajikistan", "Dushanbe");

		System.out.println(asia);

		// hw1 iterate europer by getting keys
		// hw2 iterate africa by getting values

		System.out.println("-------WORLD---------");

		List<Map<String, String>> world = new ArrayList<>();

		world.add(europe);
		world.add(asia);
		world.add(africa);

		System.out.println(world);

		System.out.println("world size --> " + world.size());

		Map<String, String> map1 = world.get(1); // get the element with index

		System.out.println("map1 --> " + map1);

		System.out.println("------Lets us iterate the world-------");

		for (Map<String, String> continent : world) {
			// System.out.println(continent);

			Set<String> countryNames = continent.keySet();
			// System.out.println(countryNames);

			for (String country : countryNames) {
				// System.out.println(country);

				String capitalCity = continent.get(country);
				System.out.println(country + " -> " + capitalCity);

			}
			System.out.println();
		}

	}
}
