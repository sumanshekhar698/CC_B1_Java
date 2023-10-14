package com.codecounty.dsa.recursion;

public class FindPowerOFANumber {

	public static void main(String[] args) {
//		n^p   n = number ; p = power

//		3^4 = 3* 3^3 
//		3^3 = 3* 3^2
//		3^2 = 3 * 3^1
//		3^1 = 3 * 3^0  
//		if 3^0 = 1 
		int n = 3;
		int p = 4;
		if (n >= 0) {
			int result = power(0, 30000);// 2^200
			System.out.println(result);
		}
		else {
			System.out.println("computation not possible using recursion");
		}

//		1^infinite

	}

	private static int power(int n, int p) {
		if (n == 1) {
			return 1;
		}

		if (p == 0)// Base condition
			return 1;
		else
			return n * power(n, p - 1);
	}

}
