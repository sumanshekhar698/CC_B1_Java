package com.codecounty.java.core.basics;

public class LoopsInJava {

	public static void main(String[] args) {

//		0 - 1000 even numbers
//		 System.out.println(0);
//		 System.out.println(2);

		// Scope
//		for (int i = 0; i <= 1000; i++) {// intialisation;condition;updation
//			if(i%2==0)
//				System.out.println(i);
//		}//1001
//		
//		FOR LOOP
		for (int i = 0; i <= 1000; i += 2) {// intialisation;condition;updation
			System.out.print(i + " ");
		} // 501

		System.out.println();
		
		
//		WHILE LOOP
		int j = 1;
		while (j <= 1000) {
			System.out.print(j + " ");
			j += 2;
		}

//		DO WHILE LOOP
		System.out.println();
		do {
			System.out.println("DOOO !!");// Atleast for one time
		} while (7 == 6);

		// WAP to find all the Armstrong Numbers between x and y

	}

}
