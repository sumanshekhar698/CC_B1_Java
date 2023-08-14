package com.codecounty.java.core.basics;

public class WrapperClasses {

	public static void main(String[] args) {

		String x = "  Suman Shekhar Java Developer    ";// Object
		int dozenPrimitive = 12;//100% Object Oriented?
		
		Integer dozen = new Integer(12);//Integer is a example of WrapperClasses
		System.out.println(dozen);
		System.out.println(dozen.MAX_VALUE);
		
		Integer valueOfDozen = dozenPrimitive;//AutoBoxing
		Integer daysInAYear = 365;//AutoBoxing
//		System.out.println(dozen.);
		
		int daysInAYearPrimitive = daysInAYear;//AutoUnBoxing
		
		Float valueOfPi = new Float(3.14159f);
		System.out.println(valueOfPi);
		
		Character ch = new Character('A');
		System.out.println(ch);
		
		
	}

}
