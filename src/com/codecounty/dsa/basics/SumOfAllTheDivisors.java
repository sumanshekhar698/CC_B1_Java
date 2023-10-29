package com.codecounty.dsa.basics;

public class SumOfAllTheDivisors {

	public static void main(String[] args) {
		int n = 10;
		int result = findSumOfDivisorsOptimized2(n);
		System.out.println(result);

	}

	private static int findSumOfDivisorsOptimized2(int n) {
//		Time : n

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i * (n / i);//number *freq

		}
		return sum;
	}

	private static int findSumOfDivisorsBruteForce(int n) {

//		Time : n^2
		int sum = 0;
		for (int i = 1; i <= n; i++) {// 1- n

			for (int j = 1; j <= i; j++) {// each number
				if (i % j == 0) {
					sum += j;
				}

			}

		}

		return sum;
	}

	private static int findSumOfDivisorsFirstOptimization(int n) {

//		Time : n^2
		int sum = 0;
		for (int i = 1; i <= n; i++) {// 1- n

			for (int j = 1; j * j <= i; j++) {// each number
				if (i / j == j) {
					sum += j;
				} else {
					sum += j + (i / j);
				}

			}

		}

		return sum;
	}

}
