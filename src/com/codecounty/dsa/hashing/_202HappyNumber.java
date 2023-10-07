package com.codecounty.dsa.hashing;

import java.util.HashSet;

public class _202HappyNumber {

	public static void main(String[] args) {
		System.out.println(isHappy(21));
	}

	static boolean isHappy(int n) {
		HashSet<Integer> hashSet = new HashSet<>();
		while (n != 1) {
			int temp = n;
			int sum = 0;
			while (temp > 0) {// sum of the squares of the temp
				int digit = temp % 10;
				sum += digit * digit;
				temp = temp / 10;
			}
			if (hashSet.contains(sum)) {//O(1)
				return false;
			}
			n = sum;
			hashSet.add(n);
//			System.out.println(hashSet);
		}
		return true;
	}
}
