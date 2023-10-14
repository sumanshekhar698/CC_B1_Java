package com.codecounty.dsa.recursion;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 12, 43, 54, 1, 35, 23, 34 };
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void bubbleSort(int[] arr) {
		int n = arr.length;
		int i, j, temp;
		boolean isSwapped;
		
		
//		O(n^2) time
//		space O(1)
		for (i = 0; i < n - 1; i++) {// passes
			isSwapped = false;
			for (j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];// swap
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSwapped = true;
				}
			}
			if (isSwapped == false) {
				break;
			}

		}

	}

}
