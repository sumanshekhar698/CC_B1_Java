package com.codecounty.java.core.oops.strings;

public class StringAreImmutable {

	public static void main(String[] args) {

		// In Java String are IMMUTABLE

		String x = "heY";
		x =  x.toUpperCase();
		System.out.println(x);
		
		String y = new String("barBie");
		y = y.toLowerCase();
		System.out.println(y);

	}

}
