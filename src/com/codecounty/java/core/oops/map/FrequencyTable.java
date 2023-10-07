package com.codecounty.java.core.oops.map;

import java.util.HashMap;

public class FrequencyTable {

	public static void main(String[] args) {

		int[] arr = { 34, 54, 45, 2, 453, 3, 23, 2, 453, 534, 64, 35, 243, 43, 45, 54, 45, 45, 45, 34, 234, 23, 423 };
//		K:V 34, 54

		HashMap<Integer, Integer> hashMap = new HashMap<>();// value:frequency

//		for (int num : arr) {//10/10
//
//			if (hashMap.containsKey(num)) {//O(n) = 1 :: 45 -->> fn() --> hash value
//				Integer currentFreq = hashMap.get(num);
//				currentFreq = currentFreq + 1;
//				hashMap.put(num, currentFreq);
//
//			} else {
//				hashMap.put(num, 1);
//			}
//
//		}

		// [2,4,2,3,4]
		for (int num : arr) {// 2

//			hm { [2,2], [4,2], [3,1] }
			hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);//
		}

		System.out.println(hashMap);
	}

}
