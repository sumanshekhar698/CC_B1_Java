package com.codecounty.java.core.oops.basics;

public class Car {

	//HAS --> instance variables
	String name;
	String model;
	float mielage;

	
	//Brhavoiurs | DOES ---> functions
	int travel() {
		System.out.println("Travelling ...");
		return 8;
	}

	void drive() {
		System.out.println("Going on a long Drive");
	}

}
