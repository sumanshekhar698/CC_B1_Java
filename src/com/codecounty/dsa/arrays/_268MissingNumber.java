package com.codecounty.dsa.arrays;

public class _268MissingNumber {

    public static void main(String[] args) {

        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int i = new Solution().missingNumber(arr);
        System.out.println(i);
        System.out.println(7^7);

    }

    static class Solution {
        public int missingNumber(int[] nums) {
        	
//        	O(n) Time = n
//        	O(n) Space = k
        	
            int n = nums.length;
            int sum1 = n * (n + 1) / 2;
            int sum2 = 0;
            for (int i = 0; i < n; i++) {
                sum2 = sum2 + nums[i];
            }
            return sum1 - sum2;
        }

        public int missingNumberUsingXOR(int[] nums) {
            int x = 0;
//        	O(n) Time = n
//        	O(n) Space = k

            for (int i = 0; i <= nums.length; i++) {
                x ^= i;
            }

            for (int i = 0; i < nums.length; i++) {
                x = x ^ nums[i];
            }
            return x;
        }
    }
}
