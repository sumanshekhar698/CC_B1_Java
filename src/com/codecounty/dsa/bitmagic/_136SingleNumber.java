package com.codecounty.dsa.bitmagic;

import java.util.Arrays;

public class _136SingleNumber {
//	https://leetcode.com/problems/single-number/description/
	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 4, 6, 6 };

		int[] cloneArr = arr.clone();
//		Arrays.sort(cloneArr);
//		System.out.println(Arrays.toString(cloneArr));

		int ans = singleNumberBrute(arr);
		System.out.println(ans);

	}

	public static int singleNumberBrute(int[] nums) {

		Arrays.sort(nums);// ascending sorting
		System.out.println(Arrays.toString(nums));

		// O(n) Time
		// Space modified

		for (int i = 0; i <= nums.length - 1; i += 2) {

			if (i > nums.length - 2) {
				return nums[nums.length - 1];
			} else if (nums[i] != nums[i + 1])
				return nums[i];
		}

		return 0;

	}

	public static int singleNumber(int[] nums) {
		int result = 0;
//		{ 4, 1, 2, 1, 2 }

//		0 ^ 1 ^ 1 ^ 2 ^ 2 ^ 4

		// 5 + 7 + 2 = 14
		// 2 + 5 + 7 = 14

//		2 ^ 2 = 0
//		1 ^ 1 = 0
//		0 ^ 4 = 4

//		Time O(n)
//		Space O(1)
		for (int i = 0; i < nums.length; i++) {
			result = result ^ nums[i];
		}

		return result;

	}

}
