package com.codecounty.java.core.oops.constructor;

import com.codecounty.java.core.oops.basics.Car;

public class Main {// class name follows PascalCase

//	for namin the return type is void
	public static void main(String[] args) {

		// function/methods and variable name follows camelCaseConvention
		int dozenOfBanana;
//		Film barbie = new Film();// I am cretaing an object/instance of Film | instatiation
//		System.out.println(barbie);// 0 - 8 U A - F
//		System.out.println(barbie.hashCode());// hex/binary and all the other format when printed will automatically be
		// converted to decimal system

		Film jailer = new Film("Jailer", "Action", 120.5f);// instatiation
		System.out.println(jailer.name);
		System.out.println(jailer.hashCode());

		Film theSameObject = jailer.getTheSameObject();
		System.out.println(theSameObject.hashCode());
//		System.out.println(theSameObject);

//		Car car = new Car();//Access Specifiers

//		Film mi = new Film("MI", "Action");// instatiation
//		System.out.println(mi.name);

//		int a = 897997;
//		int m = 0B01010;//binary
//		int o = 01010;//octal
//		int x = 077;//octal
//		int y = 0Xa7f9767;
//		System.out.println(m);//Printing number will always be in Decimal Format
//		System.out.println(o);
//		System.out.println(y);

	}

}
