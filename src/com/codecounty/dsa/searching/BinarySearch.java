package com.codecounty.dsa.searching;

public class BinarySearch {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		int target = 20;
		int result = binarySearch(arr, arr.length, target);
		System.out.println(result);
	}

	private static int binarySearch(int[] arr, int n, int target) {
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target)
				return mid;
			else if (arr[mid] > target)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}
}
