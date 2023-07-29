package com.codecounty.java.core.basics;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		// SoftDrink Vending Machine

		Scanner scanner = new Scanner(System.in);

//		if (input == 1)
//			System.out.println("Here is your Coke");
//		else if (input == 2)
//			System.out.println("Here is your ThumbsUp");
//		else if (input == 3)
//			System.out.println("Enjoy the Limca");
//		else
//			System.out.println("Invalid Input");

//		while(true) {
//			
//		}

		boolean flag = true;
		vendingMachine: for (;;) {
//		for (; flag;) {

			System.out.println("Enter you favourite softdrink\n 1 : CocaCola \n 2: ThumsUp \n 3: Limca \n 0: EXIT"); // \n
																														// is
																														// called
																														// next
																														// line
			int input = scanner.nextInt();
			switch (input) {
			case 1: {
				System.out.println("Here is your Coke");
				break;
			}
			case 2: {
				System.out.println("Here is your ThumbsUp");
				break;
			}
			case 3: {
				System.out.println("Enjoy the Limca");
				break;
			}

			case 0: {

				System.out.println("Thanks for coming to us!!");
//				flag = false;
//				break;
				break vendingMachine;
			}

			default: {
				System.out.println("Invalid Input");
				break;
			}
			}
		}

	}

}
