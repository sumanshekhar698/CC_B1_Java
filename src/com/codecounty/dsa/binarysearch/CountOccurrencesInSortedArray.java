package com.codecounty.dsa.binarysearch;

public class CountOccurrencesInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,2,3};
        int target = 2;
        int result = countOccurrences(arr,target);
        System.out.println("Number Of Occurrences of "+target+" is :: "+result);
    }

    /**
     * Function to find the number of occurrences of target value in sorted array
     * @param arr : Input Array
     * @param target : target value
     * @return the number of occurrences of target value in sorted array
     */
    private static int countOccurrences(int[] arr, int target) {
        int n = arr.length;
        int firstOccurrences = getFirstOccurrences(arr,n,target);
        if(firstOccurrences == -1) return 0;
        int lastOccurrences = getLastOccurrences(arr,n,target);
        return (lastOccurrences-firstOccurrences)+1;
    }
    private static int getFirstOccurrences(int[] arr, int n, int target) {
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
    private static int getLastOccurrences(int[] arr, int n, int target) {
        int low = 0;
        int high = n-1;
        while(low <= high) {
            int mid = (low+high)/2;
            if(arr[mid] > target)
                high = mid-1;
            else if(arr[mid] < target)
                low = mid+1;
            else {
                if(mid == n-1 || arr[mid+1] != arr[mid])
                    return mid;
                else
                    low = mid+1;
            }
        }
        return -1;
    }
}
