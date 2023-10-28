package com.codecounty.dsa.arrays;

public class _53MaximumSubarrayUsingKanadaneAlgorithm {

	public static void main(String[] args) {
		int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int result = maxSubArray(arr);
		System.out.println(result);

	}

	private static int maxSubArray(int[] nums) {
		int sum = nums[0];
		int maxSum = sum;
		
		for (int i = 1; i < nums.length; i++) {
			sum = Integer.max(nums[i], nums[i] + sum);
			maxSum = Integer.max(sum, maxSum);
		}
		return maxSum;
	}

}
