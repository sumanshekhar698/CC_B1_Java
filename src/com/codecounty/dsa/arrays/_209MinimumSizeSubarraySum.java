package com.codecounty.dsa.arrays;

public class _209MinimumSizeSubarraySum {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 1, 2, 4, 3 };
		int ans = minSubArrayLen(7, arr);
		System.out.println(ans);

	}

	public static int minSubArrayLen(int target, int[] nums) {

		int i = 0;// left part of teh window
		int sum = 0, result = Integer.MAX_VALUE;

//		Time =O(n)=  n
		for (int j = 0; j < nums.length; j++) {// j will control the right part of the window
			sum += nums[j];

			while (sum >= target) {// slidng window will adjust the left part
				result = Integer.min(result, j - i + 1);
				sum -= nums[i];
				++i;
			}

		}

		return result == Integer.MAX_VALUE ? 0 : result;

	}

}
