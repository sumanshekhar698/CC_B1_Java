package com.codecounty.java.core.oops.basics;

public class Main {

	public static void main(String[] args) {

//		x is a local variable and is local to main()
		int x;// declaration of x BUT you havent initialized it
//		 System.out.println(x);

		Car mazda = null;

		Car skoda = new Car();
		skoda.mielage = 16.8f;
		skoda.name = "Skoda Kushaq NEW MODEL";
		System.out.println(skoda.model);
		System.out.println(skoda.name);

		Car hondaCivic = new Car();
		hondaCivic.name = "Honda Civic";
		hondaCivic.mielage = 14.01f;

		System.out.println(skoda.mielage);
		System.out.println(hondaCivic.mielage);

		System.out.println(mazda);

		mazda = hondaCivic;
		System.out.println(mazda.name);

		skoda = null;// skoda is nointing to no objects so the original objcts has become garbage
						// since no variables is pointing to it

		System.gc();// invokes Grabage collector

	}

}
