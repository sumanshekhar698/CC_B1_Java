package com.codecounty.dsa.binarysearch;

public class FloorInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,8,10,11,12,19};
        int target = 5;
        int result = findFloor(arr,target);
        if(result == -1)
            System.out.println("No element less than " +target+" So Output is -1");
        else
            System.out.println(" Largest Number less than "+target+" is "+arr[result]+ " , whose index is "+result);

    }

    /**
     * Function to find floor in sorted array
     * Floor of x is defined as the largest element K in arr[] such that K is smaller than or equal to x
     * @param arr : Input Array
     * @param target : target value
     * @return the target value's floor index in the sorted array
     */
    private static int findFloor(int[] arr, int target) {
        int low = 0 , high = arr.length-1;
        int res = -1;
        while(low <= high) {
            int mid = (low + high)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                high = mid-1;
            else {
                res = mid;
                low = mid + 1;
            }
        }
        return res;
    }
}
