package com.codecounty.java.core.basics;

public class NonPrimitiveData {

	public static void main(String[] args) {

		String x = "  Suman Shekhar Java Developer    ";// Object
		String z = "  Suman Shekhar Java Developer    ";
		String y = new String(x);
//		x = x.trim();
		System.out.println(x);

		if (x == z)
			System.out.println(true);
		else
			System.out.println(false);
		
		int dozen = 12;//100% Object Oriented?

	}

}
