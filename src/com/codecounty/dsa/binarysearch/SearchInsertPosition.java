package com.codecounty.dsa.binarysearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 6;
        int result = searchInsert(nums,target);
        System.out.println(result);
    }

    /**
     * Function to find the index if the target is found. If not, return the index where it would be if it were inserted in order.
     * @param nums : Input Array
     * @param target : target value
     * @return the index if the target is found. If not, return the index where it would be if it were inserted in order.
     */
    private static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low <= high) {
            int mid = (low + high)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
}
