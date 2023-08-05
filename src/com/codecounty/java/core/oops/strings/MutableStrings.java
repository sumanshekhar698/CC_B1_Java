package com.codecounty.java.core.oops.strings;

public class MutableStrings {

	public static void main(String[] args) {

		// Strings are immutable
		String x = "mango";

//		x = x + "apple";
		x = x.concat("apple");// mangoapple
		System.out.println(x);

		// Mutable String
		StringBuilder sbu = new StringBuilder(" barbie");

		System.out.println(sbu);
//		sbu = sbu + " openiheimer";
		sbu.append(" openiheimer");
		System.out.println(sbu);
		sbu.reverse();
		System.out.println(sbu);

		sbu.delete(3, 7);
		System.out.println(sbu);

		String y = "mango";// equals() compares character by character only for String object
		StringBuilder sbu2 = new StringBuilder("mango");
		StringBuffer sbuf = new StringBuffer("mango");// thread safe so good for Muti Threaded env

		if (sbu2.toString().equals(y)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		if (sbu2.toString().equals(sbuf.toString())) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

//		sbu.

	}

}
