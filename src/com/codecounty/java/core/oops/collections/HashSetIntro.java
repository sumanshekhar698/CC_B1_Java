package com.codecounty.java.core.oops.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetIntro {

	public static void main(String[] args) {

		int arr[] = { 24, 5, 54456, 43 };

		// Remove Duplicates
		ArrayList<Integer> arrInt = new ArrayList<Integer>() {
			{
				add(2);
				add(4);
				add(14);
				add(33);
				add(2);
				add(33);
				add(33);
				add(4);
			}
		};

		arrInt.add(3);
		System.out.println(arrInt);

		ArrayList<Integer> arrIntUnique = new ArrayList<Integer>();

		for (Integer num : arrInt) {

			if (!arrIntUnique.contains(num)) {
				arrIntUnique.add(num);
			}

		}

		System.out.println(arrIntUnique);

		//HashSet does not conatins duplicate LF = 0.75
		HashSet<Integer> setOfInt = new <Integer>HashSet();//Hashing     -- num --> hashFn() --- hashcode[it will be teh address of the object]-->
		for (Integer num : arrInt) {
			setOfInt.add(num);

		}

		//O(n) linear search = n
		//O(n) bianry search= (Soreted arrays) = log n

		System.out.println(setOfInt);
		setOfInt.add(45);
		boolean contains = setOfInt.contains(2);//O(n) = 1
		System.out.println(contains);
		setOfInt.stream().forEach(System.out::println);

	}

}
