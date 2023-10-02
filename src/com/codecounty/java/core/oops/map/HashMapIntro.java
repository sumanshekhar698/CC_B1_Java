package com.codecounty.java.core.oops.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class HashMapIntro {

	public static void main(String[] args) {

//		rollNo: Name
		HashMap<Integer, String> hashMap = new HashMap<>();// <Integer, String> => Entry=> rollNo: Name
		hashMap.put(2, "John Doe");
		hashMap.put(4, "Mary");
		hashMap.put(6, "Johnny Depp");
		hashMap.put(1, "Taylor Swift");
		hashMap.put(12, "Adam");
		hashMap.put(11, "Michael");
		hashMap.put(91, "Brittany");
//		hashMap.put(12, "Dua Lipa");// you cannot have two entries with the same Key

		System.out.println(hashMap);
		System.out.println(hashMap.get(4));// you can only use Key to get a value :: the hashing is done on key not on
											// value

		System.out.println(hashMap.size());
		System.out.println(hashMap.isEmpty());// set and HashMap have no indexed access

		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();

		for (Entry<Integer, String> entry : entrySet) {
			System.out.print(entry.getKey() + "::");
			System.out.print(entry.getValue() + " ");
		}

		List<Entry<Integer, String>> collect = hashMap.entrySet().stream().filter(x -> x.getValue().length() <= 5)
				.collect(Collectors.toList());
		System.out.println();
		System.out.println(collect);

	}

	class Pair {
		int rollNo;
		String name;
	}

}
