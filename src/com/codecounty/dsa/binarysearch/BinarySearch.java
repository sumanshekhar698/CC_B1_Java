package com.codecounty.dsa.binarysearch;

import java.util.Scanner;



public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int target = 20;
        int result = binarySearch(arr , arr.length, target);
        System.out.println(result);
      }

    /**
     * Function to search an element in sorted array
     * @param arr : Input Array
     * @param n : Size of array
     * @param target : target value
     * @return the index of target element in sorted array
     */
      private static int binarySearch(int[] arr , int n, int target) {
        int low = 0;
        int high = n-1;
        while(low <= high) {
            int mid = (low + high)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
