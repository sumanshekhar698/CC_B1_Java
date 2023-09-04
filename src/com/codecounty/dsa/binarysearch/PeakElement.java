package com.codecounty.dsa.binarysearch;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        int result = findPeakElement(arr);
        System.out.println(result);
    }

    /**
     * Function to find a peak element, and return its index.
     * @param arr : Input Array
     * @return the index of peak element
     */
    private static int findPeakElement(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if((mid == 0 || arr[mid] > arr[mid-1]) && (mid == n-1 || arr[mid] > arr[mid+1]))
                return mid;
            else if(mid > 0 && arr[mid-1] > arr[mid])
                high = mid-1;
            else
                low = mid+1;
        }
    return -1;
    }
}
