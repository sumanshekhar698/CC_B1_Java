package com.codecounty.java.core.oops.final_kweyword;

public class Toy {

	// final keyword with instance varibale

	final String color;// fianl instance variable must be initialized at OBJECT CRATION
	final int[] arr;

	public Toy(String color) {
		this.color = color;
		this.arr = new int[color.length()];
	}

}
