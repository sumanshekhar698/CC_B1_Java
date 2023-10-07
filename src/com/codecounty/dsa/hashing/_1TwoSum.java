package com.codecounty.dsa.hashing;

import java.util.HashMap;

public class _1TwoSum {

	public static void main(String[] args) {

		int arr[] = { 2, 7, 11, 15 }, target = 9;
		int[] result = twoSum(arr, target);
	}

	private static int[] twoSum(int[] arr, int target) {
		int[] result = new int[2];
		HashMap<Integer, Integer> map = new HashMap();

//		{   2, c 7, 11, 15 }, target = 9;  target - current

//		map {[2,0] ,  }
		int current;
		for (int i = 0; i < arr.length; i++) {
			current = arr[i];
			if (map.containsKey(target - current)) {//O(1)
				result[0] = i;
				result[i] = map.get(target - current);
				return result;
			} else {
				map.put(current, i);
			}

		}

		return result;
	}

}
