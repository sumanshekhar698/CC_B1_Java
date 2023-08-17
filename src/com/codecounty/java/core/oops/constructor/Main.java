package com.codecounty.java.core.oops.constructor;

public class Main {

	public static void main(String[] args) {

		Film barbie = new Film();//I am cretaing an object/instance of Film | instatiation
		System.out.println(barbie);// 0 - 8 U A - F
		System.out.println(barbie.hashCode());// hex/binary and all the other format when printed will automatically be
												// converted to decimal system

		int a = 897997;
		int m = 0B01010;//binary
		int o = 01010;//octal
		int x = 077;//octal
		int y = 0Xa7f9767;
		System.out.println(m);
		System.out.println(o);
		System.out.println(y);

	}

}
