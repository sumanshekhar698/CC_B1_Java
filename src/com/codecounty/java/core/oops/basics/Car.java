package com.codecounty.java.core.oops.basics;

public class Car {//has a naming cionvention of PascalCase  TiffinBox

	// HAS (properties)--> instance variables
	String name;//Strings are objects and allobjects have a default value of null
	String model;
	float mielage;//mielage is not object primitive variable

	// DOES (finctionality) Behaviours | DOES ---> functions aka methods
	int travel() {
		System.out.println("Travelling ...with a mielage of" + mielage);

		return 8;
	}

	void drive() {
		System.out.println("Going on a long Drive");
	}

}
