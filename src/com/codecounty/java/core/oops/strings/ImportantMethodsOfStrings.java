package com.codecounty.java.core.oops.strings;

import java.util.Arrays;

public class ImportantMethodsOfStrings {

	public static void main(String[] args) {

		String x = "  BarbiE vs OpenHiemer  ";
		String y = "  BarbiE vs OpenHiemer  ";
		x = x.toLowerCase();
		System.out.println(x);// barbie vs openhiemer

		x = x.trim();
		System.out.println(x);// barbie vs openhiemer

		int length = x.length();// the lengthe is 20 but indexing starts from 0 and left to right
		System.out.println(length);// 20 characters

//		char ch = x.charAt(4);
		System.out.println(x.charAt(4));
		System.out.println(x.charAt(x.length() - 1));

		System.out.println(x.substring(0, 6));// stating index is inclusive BUT ending index is excliusive

		System.out.println(x.substring(10, x.length()));
		System.out.println(x.substring(4));

		int length2 = y.trim().toLowerCase().substring(4).length();
		System.out.println(length2);

		// MIB
//		x = x.concat(" MIB");//means adding at the end
//		System.out.println(x);
		
//		x = x + " MIB";
//		System.out.println(x);// + will also adds at the end
		
		x = "MIB ".concat(x);
		
//		x = "MIB " + x;
		System.out.println(x);
		
//		String
		String z = "";
		System.out.println(z.length());
		
		
		System.out.println(z.length() == 0);
		System.out.println(z.isEmpty());
//		System.out.println(z.);
		
//		String s = "   fly me   to   the moon  ";
//		String[] split = s.split(" ");
//		System.out.println(Arrays.toString(split));



	}

}
