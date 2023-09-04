package com.codecounty.dsa.binarysearch;

public class FirstOccurencesInSortedArray {
    public static void main(String[] args) {

        int[] arr = {10,20,30,30,30,30,30,40,40,40,50,60,70};
        int target = 30;
        int result = firstOccurencesInSortedArray(arr , arr.length, target);
        System.out.println("Result :: "+result);
    }

    /**
     * Function to find the first Occurrences of element in sorted array
     * @param arr
     * @param n
     * @param target
     * @return the index of first occurrences of element
     */
    private static int firstOccurencesInSortedArray(int[] arr, int n, int target) {
        int low = 0;
        int high = n-1;
        while(low <= high) {
            int mid = (low+high)/2;
            if(arr[mid] > target)
                high = mid-1;
            else if(arr[mid] < target)
                low = mid+1;
            else {
                if(mid == 0 || arr[mid-1] != arr[mid])
                    return mid;
                else
                    high = mid-1;
            }
        }
        return -1;

    }
}
