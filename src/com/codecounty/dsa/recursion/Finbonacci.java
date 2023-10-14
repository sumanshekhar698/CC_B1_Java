package com.codecounty.dsa.recursion;

import java.util.Scanner;

public class Finbonacci {

	public static void main(String[] args) {
//		iterative

//		0,1,   1,2,3,5 //Fibonacci Series
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n > 0) {
			int result = fib(n);
			System.out.println(result);
		} else {
			System.out.println("Invalid inpiut for Fibonaaci");
		}

	}

	private static int fib(int n) {
//		fib(6) = fib(5) + fib(4)
//		if(n==0)
//			return 0;
//		if(n==1)
//			return 1;

		if (n <= 1) {//Fibonaaci
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}

}
