package com.codecounty.java.core.basics;

public class BreakAndContinueInLoop {

	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {

			System.out.print(i + " ");
			if (i == 15)
				break; //breaks the whole loop
			// for while do while | even in switch cases

		}

		for (int i = 0; i < 20; i++) {

			if (i == 15)
				continue;//skip the current itration

			System.out.println(i);

		}

	}

}
