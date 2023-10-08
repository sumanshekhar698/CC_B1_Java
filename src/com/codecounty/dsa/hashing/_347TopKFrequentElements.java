package com.codecounty.dsa.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class _347TopKFrequentElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 1, 1, 2, 2, 3, 3, 423, 43, 435, 24, 232, 4, 23, 4, 24, 24, 24, 5, 5445, 45, 89 };
		int[] topKFrequentElements = topKFrequentOtimzedViaPriorityQueue(arr, 2);
		System.out.println(Arrays.toString(topKFrequentElements));

	}

	public static int[] topKFrequentOtimzedViaPriorityQueue(int[] nums, int k) {

		HashMap<Integer, Integer> map = new HashMap();// {[1:3], [2,2], [3,1]}
//		O(n) Time : n 
//		O(n) Space : n  +n

//		for (int i = 0; i < nums.length; i++) {// frequency map
//			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//		}

		for (int num : nums) {// frequency map
			if (map.containsKey(num)) {// O(n) = 1 :: 45 -->> fn() --> hash value
				Integer currentFreq = map.get(num);
				currentFreq = currentFreq + 1;
				map.put(num, currentFreq);
			} else {
				map.put(num, 1);
			}
		}

		PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());// Comparator
																													// in
																													// form
																													// of
																													// Lambda
																													// fn
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			pq.add(entry);
		}

		int[] topKFrequent = new int[k];

//		System.out.println(pq);
		for (int i = 0; i < k; i++) {
			topKFrequent[i] = pq.poll().getKey();
//			System.out.println(pq);

		}
//		System.out.println(pq);

		return topKFrequent;
	}

	public int[] topKFrequentHashMap(int[] nums, int k) {

		HashMap<Integer, Integer> map = new HashMap();// {[1:3], [2,2], [3,1]}

//		for (int i = 0; i < nums.length; i++) {// frequency map
//			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//		}

//		O(n) Time : n +kn
//		O(n) Space : n
		for (int num : nums) {// frequency map
			if (map.containsKey(num)) {// O(n) = 1 :: 45 -->> fn() --> hash value
				Integer currentFreq = map.get(num);
				currentFreq = currentFreq + 1;
				map.put(num, currentFreq);
			} else {
				map.put(num, 1);
			}
		}

		int[] topKFrequent = new int[k];
		for (int i = 0; i < k; i++) {// {[1:0], [2,2], [3,1]}
			int key = 0;
			int value = 0;
			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
				if (entry.getValue() > value) {
					key = entry.getKey();
					value = entry.getValue();
				}

			}
			map.put(key, 0);// *
			topKFrequent[i] = key;

		}

		return topKFrequent;
	}

}
