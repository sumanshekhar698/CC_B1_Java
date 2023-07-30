package com.codecounty.java.core.oops.strings;

public class StringIntro {

	public static void main(String[] args) {

		// Intialising String using String literal
		String str1 = "hey barbie";
		// Strings are sequence of characters
		// Strings are objects
//		String num = "433";
//		num += 1;
//		System.out.println(num);

		String str2 = "hey barbie";
		String str3 = new String("hey barbie");// Initialising String with new keyword
		String str4 = new String("hey barbie");// Initialising String with new keyword
		String str5 = new String("Hey BarBie");// Initialising String with new keyword


		if (str1 == str2) {// In case of objects == compares addreess 
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		if (str1 == str3) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		
		if (str3 == str4) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		
		if (str1.equals(str3)) {// equals() compalres the value instead of address
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		
		if (str1.equalsIgnoreCase(str5)) {// equals() compalres the value instead of address
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		


	}

}
