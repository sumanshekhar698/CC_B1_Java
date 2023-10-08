package com.codecounty.dsa.heap;

import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;

public class _215KthLargestElementInAnArray {

	public static void main(String[] args) {

		int arr[] = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
		int x = findTopKLargest(arr, 4);
		System.out.println(x);
	}

	private static int findTopKLargest(int[] arr, int k) {

//		HashSet<Integer> hashSet = new HashSet();
//		for (int num : arr) {
//			hashSet.add(num);
//		}
		
//		O(n) Time : n
//		O(n) Space : n

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
		for (int num : arr) {
			priorityQueue.add(num);
		}
		
//		System.out.println(priorityQueue);

		int result = 0;
		for (int i = 0; i < k; i++) {
			result = priorityQueue.poll();
//			System.out.println(priorityQueue);
//			System.out.println(result);
		}

		return result;
	}

}
