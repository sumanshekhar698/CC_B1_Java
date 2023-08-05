package com.codecounty.java.core.oops.strings;

public class BattleOfStrings {

	public static void main(String[] args) {

		String x = "Barbie ";
		StringBuilder sbu = new StringBuilder("Barbie ");

		long start = System.nanoTime();
//		for (int i = 0; i < 100000; i++) {//Time => 45478567600 ns =  45,478,567,600 ns = 45.5 seconds

//			x += "Hey Barbie";
//		}

		for (int i = 0; i < 100000; i++) {//Time => 007,443,100 ns = 0.007 seconds
			sbu.append("Hey Barbie");
		}

		long end = System.nanoTime();
		System.out.println("Time => " + (end - start));

	}

}
