package com.codecounty.dsa.binarysearch;

public class SquareRoot {
    public static void main(String[] args) {
        int x = 8;
        int result = mySqrt(x);
        System.out.println(result);
    }

    /**
     * Function to find the square root of x rounded down to nearest integer
     * @param x : Input Value
     * @return the square root of x rounded down to the nearest integer.
     */
    private static int mySqrt(int x) {
        long low = 1 , high = x;
        long res = 0;
        while(low <= high) {
            long mid = low + (high - low)/2;
            if(mid*mid == x)
                return (int) mid;
            else if(mid*mid > x)
                high = mid - 1;
            else {
                res = mid;
                low = mid + 1;
            }
        }
        return (int) res;
    }
}
