package com.codecounty.java.core.oops.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListIntro {

	public static void main(String[] args) {

		int[] arr = { 23, 43, 43, 43, 43 };// indexed access
//		non dynamic

		ArrayList arrayList = new ArrayList();// you can only add objects
		arrayList.add(3);
		arrayList.add(true);
		arrayList.add("fun");
		arrayList.add(7.88);
		System.out.println(arrayList);

		int x = 8;
		Integer x_ = x;// auto boxing

		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		intArrayList.add(43);
		intArrayList.add(443);
		intArrayList.add(423);
		intArrayList.add(243);
		System.out.println(intArrayList);
		System.out.println(intArrayList.size());
		intArrayList.add(243);
		intArrayList.add(243);
		System.out.println(intArrayList.size());
		intArrayList.remove(2);
		System.out.println(intArrayList.size());

		intArrayList.clear();
		System.out.println(intArrayList.size());

		intArrayList.add(43);
		intArrayList.add(443);
		intArrayList.add(424);
		intArrayList.add(243);

		Integer integer = intArrayList.get(2);
		System.out.println(integer);

		intArrayList.set(1, 999);

		System.out.println(intArrayList);

		// 1. iterating over an arraylist
//		for (int i = 0; i < intArrayList.size(); i++) {//THIS IS THE MOST HORRIBLE WAY TO ITERATE OVER AN ARRAYLIST
//			intArrayList.add(i);
//			System.out.print(intArrayList.get(i) + " ");
//		}

//		2. foreach OR enhaced for loop
		for (Integer num : intArrayList) {
//			intArrayList.add(99);//Fail Safe mechanism
			System.out.print(num + " ");
		}

		System.out.println();
//		 [43, 999, 424, 243i]
//		3. Using iterators
		Iterator<Integer> iterator = intArrayList.iterator();
		while (iterator.hasNext()) {// TODO use iterator to iterate on a ArrayList in a reverse order
			Integer num = (Integer) iterator.next();
			System.out.print(num + " ");
		}

		System.out.println("\n");
//		4.

//		Arrays
//		 [43, 999, 424, 243]
		// TODO Use lambada fn to achieve teh same thing
		intArrayList.stream().forEach(System.out::println);// :: double colon operator OR  method reference

		intArrayList.add(23);
		intArrayList.add(35);
		intArrayList.add(2523);
		intArrayList.add(24);
		intArrayList.add(-232);
		intArrayList.add(-3);
//		intArrayList.add(null);


		Collections.sort(intArrayList, Collections.reverseOrder());
		System.out.println("\n");
		intArrayList.stream().forEach(System.out::println);// ;; method reference

		ArrayList<Emp> employees = new ArrayList();
		employees.add(new Emp("Jane Doe", 7));
		employees.add(new Emp("John Doe", 17));
		employees.add(new Emp("Michael Philips", 1));
		employees.add(new Emp("Taylor Swift", 8));
		



	}

}

class Emp {
	String name;
	int id;

	public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

}
