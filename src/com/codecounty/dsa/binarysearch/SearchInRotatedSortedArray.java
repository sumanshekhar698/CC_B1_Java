package com.codecounty.dsa.binarysearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int result = search(nums,target);
        if(result == -1)
            System.out.println("Target is not found in array");
        else
            System.out.println("Target is found at Index :: "+result);

    }

    /**
     * Function to search in rotated sorted array
     * @param nums : Input Array
     * @param target : target value
     * @return the index of the target
     */
    private static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] >= nums[low]) {
                if(target >= nums[low] && target <= nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            else {
                if(target >= nums[mid] && target <= nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }

}
