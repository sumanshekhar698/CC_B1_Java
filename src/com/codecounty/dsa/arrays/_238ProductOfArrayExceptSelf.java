package com.codecounty.dsa.arrays;

import java.util.Arrays;

public class _238ProductOfArrayExceptSelf {

	public static void main(String[] args) {

		int[] nums = { 2, 3, 4, 5 };

		int[] result = productExceptSelfLinearTime(nums);
		System.out.println(Arrays.toString(result));

	}

	private static int[] productExceptSelfBrute(int[] nums) {

		int[] result = new int[nums.length];

//		Time: O(n) = n^2
//		Space: O(n) = n
		int ans;
		for (int i = 0; i < nums.length; i++) {
			ans = 1;
			for (int j = 0; j < nums.length; j++) {
				if (j == i)
					continue;
				ans *= nums[j];
			}
			result[i] = ans;

		}

		return result;

	}

	private static int[] productExceptSelfLinearTime(int[] nums) {

		int[] result = new int[nums.length];
		int[] prefix = new int[nums.length];
		prefix[0] = 1;

		int[] suffix = new int[nums.length];
		suffix[suffix.length - 1] = 1;

//		Time: O(n) = 3n = n
//		Space: O(n) = 3n
//		2n SPACE ?
		
		// enrich the prefix array
		for (int i = 1; i < prefix.length; i++) {
			prefix[i] = prefix[i - 1] * nums[i - 1];
		}

		// enrich the suffix array
		for (int i = suffix.length - 2; i >= 0; i--) {
			suffix[i] = suffix[i + 1] * nums[i + 1];
		}

		// enrich the result array
		for (int i = 0; i < result.length; i++) {
			result[i] = prefix[i] * suffix[i];
		}
		
		return result;

	}

}
