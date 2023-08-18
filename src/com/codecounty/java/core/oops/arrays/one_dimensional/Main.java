package com.codecounty.java.core.oops.arrays.one_dimensional;

class Main {

	public static void main(String[] args) {// used to take the String input during runtime

//		System.out.println("Hello World");
//		System.out.println(args.length);

		String x = "67";
		
		if (args.length == 2) {
			System.out.println("Args 1 => " + args[0]);
			System.out.println("Args 2 => " + args[1]);
			int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
			System.out.println(sum);

		}
		
//		System.out.println(sum);

	}

}