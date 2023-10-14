package com.codecounty.dsa.recursion;

public class MergeSort {// if you have a single element in the array its sorted

	public static void main(String[] args) {

		int arr[] = { 38, 27, 43, 10 };
		sort(arr, 0, arr.length - 1);

	}

	private static void sort(int[] arr, int l, int h) {
		
//		O(n) time = log n
		if (l < h) {// base condition
//			int mid = (l+h)/2;
			int mid = l + (h - l) / 2;
			sort(arr, l, mid);
			sort(arr, mid + 1, h);

			merge(arr, l, mid, h);

		}

	}

	// 0,1,2,3,4,5,6

	private static void merge(int[] arr, int l, int mid, int h) {

		int p = mid - l + 1;// temp arrays size
		int q = h - mid;

		int[] pArr = new int[p];// temp arrays
		int[] qArr = new int[q];

		// copy data to temp arrays
		for (int i = 0; i < p; i++) {
			pArr[i] = arr[l + i];
		}

		for (int j = 0; j < q; j++) {
			qArr[j] = arr[mid + j + 1];
		}

		int k = l, i = 0, j = 0;
		while (i < p && j < q) {// merging
			if (pArr[i] <= qArr[j]) {
				arr[k] = pArr[i];
				i++;
			} else {
				arr[k] = qArr[j];
				j++;
			}
			++k;
		}

		// copy the reaminng are elements if something is left
		while (i < p) {
			arr[k] = pArr[i];
			++i;
			++k;

		}

		while (j < q) {
			arr[k] = qArr[k];
			++j;
			++k;
		}

	}

}
