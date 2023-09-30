package com.codecounty.java.core.oops.exception_handling;

import java.util.Scanner;

public class CustomExceptions {

	public static void main(String[] args) {
		System.out.println("Enetr you age: ");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();

		try {
			boolean isEligible = checkVotingAge(age);
		} catch (InvalidVotingAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static boolean checkVotingAge(int age) throws InvalidVotingAgeException {//you are creating your check exceptions
		if (age >= 18) {
			System.out.println("Eligible for voting");
			return true;
		} else {
			System.out.println("NOT Eligible for voting");
			throw new InvalidVotingAgeException("NOT Eligible for voting");

		}

	}

}

class InvalidVotingAgeException extends Exception {// 1

	public InvalidVotingAgeException(String message) {// 2
		super(message);
	}

}
