package com.codecounty.java.core.oops.constructor;

public class Film {

	String name;
	String genre;
	float durationInMinutes;

	// constructiors dont have a return type
	Film() {// constructor which is not parametrized
		// *Corresponding constructors are automatically triggred while creating object
		System.out.println("Film() called");
	}

	Film(String name, String genre, float durationInMinutes) {// parameterized constructor
		this(name, genre);// constructor chaining should be the 1st stamenet
		System.out.println("Film(parameterized 1) called");

		this.name = name;// shadow problem
		this.genre = genre;
		this.durationInMinutes = durationInMinutes;
	}

	Film(String name, String genre) {// parameterized constructor
		this();
//		this("khusi","devyani",686.7f); //dont try to create constructor chaining loops

		System.out.println("Film(parameterized 2) called");
		this.name = name;// shadow problem
		this.genre = genre;
	}

//	If there are NO explicitly constructors declared in the class, During runtime JVM will add a default constructor
	Film getTheSameObject() {
		return this;// this always points to the current object
	}

}
