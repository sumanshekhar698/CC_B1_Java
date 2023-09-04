package com.codecounty.dsa.binarysearch;

public class MinimumInSortedRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int result = findMin(arr);
        System.out.println("Minimum Element in Rotated sorted Array :: "+result);
    }

    /**
     * Function to find minimum in rotated sorted array
     * @param arr : Input Array
     * @return the minimum element in rotated sorted array
     */
    private static int findMin(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low <= high) {
            if(arr[low] <= arr[high]) return arr[low];
            int mid = low + (high-low)/2;
            if((mid == 0 || arr[mid] < arr[mid-1]) && (mid == n-1 || arr[mid] < arr[mid+1]))
                return arr[mid];
            else if(arr[low] <= arr[mid])
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;

    }

}
