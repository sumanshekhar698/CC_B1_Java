package com.codecounty.dsa.arrays;

import java.util.Arrays;

public class _217ContainsDuplicate {
//	https://leetcode.com/problems/contains-duplicate/
	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 1 };
		boolean result = containsDuplicate(nums);
		System.out.println(result);

	}

	public static boolean containsDuplicateBrute(int[] nums) {

//		Time(n) = n n-1 n-2   | 4 + 3 +2 +1 = n(n+1) /2 = n^2
//		Space(n) = O(1)

		for (int i = 0; i < nums.length; i++) {// n
//			int count = 1;
			for (int j = i + 1; j < nums.length; j++) {// n-1
				if (nums[i] == nums[j]) {
					return true;
				}
			}
//			if (count >= 2)
//				return true;
		}

		return false;

	}

	public static boolean containsDuplicate(int[] nums) {
//		{ 1, 2, 3, 1 };

//		Bubble Sort n^2
//		Merge Sort nlogn
		
		
//		Time(n) = nlogn + n = nlogn
//		Space(n) = O(1)

		Arrays.sort(nums);// [1,1,2,3] n log n

		for (int i = 0; i < nums.length - 1; i++) {// n
			if (nums[i] == nums[i + 1])
				return true;
		}

		return false;

	}

}
