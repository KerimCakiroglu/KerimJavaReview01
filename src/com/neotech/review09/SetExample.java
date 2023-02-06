package com.neotech.review09;

import java.util.HashSet;
import java.util.Iterator;
// all imported
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	// Collection
	// List | Set | Queue (Three interfaces inheriting Collection interface)

	// ArrayList | LinkedList (Two classes implementing the List interface)

	// HashSet | HashLinkedSet | TreeSet (Three classes implementing the Set
	// interface)

	public static void main(String[] args) {

		Set<String> africaLinked = new LinkedHashSet<>(); // up-casting

		africaLinked.add("Egypt");
		africaLinked.add("Niger");
		africaLinked.add("Morocco");
		africaLinked.add("Ghana");

		System.out.println(africaLinked);
		System.out.println("Size  --> " + africaLinked.size());

		// It will not add in the Set, because they already exist
		boolean added = africaLinked.add("Morocco");
		africaLinked.add("Niger");

		System.out.println(africaLinked);
		System.out.println("Size  --> " + africaLinked.size());
		System.out.println("Was is added in the Set? " + added);

//Can i add with an index in a SET? -> NO
//africaLinked.add(2,"Zambia");

		System.out.println("LinkedHashSet ---> " + africaLinked);

		Set<String> africaTree = new TreeSet<>(africaLinked);

		System.out.println("TreeSet (alphabetical) ---> " + africaTree);

		Set<String> africaHash = new HashSet<>();

		africaHash.addAll(africaLinked);

		int size = africaHash.size();
		System.out.println("HashSet (random) ---> " + africaHash);
		System.out.println("Size --> " + size);

		boolean contains = africaHash.contains("Turkey");
		boolean isEmpty = africaHash.isEmpty();

		// What will happen if I try to remove?
		boolean ableToRemove = africaHash.remove("Turkey");

		System.out.println("Was I able to remove Turkey? " + ableToRemove);

		// Note: we are NOT able to get /add/remove byINDEX in aSET
		// africaHash.get(2);

		System.out.println("-----1st way, for loop DOES Not work in a SET-------");

		// Iterate africaHash using enchanged for loop
		System.out.println("----2nd way, enchanged/advanced for loop");

		for (String country : africaHash) {
			System.out.println(country);
		}

		System.out.println("---3rd way, using iterator");

		Iterator<String> it = africaHash.iterator();

		while (it.hasNext()) {
			String country = it.next();
			System.out.println(country);

		}

	}

}
