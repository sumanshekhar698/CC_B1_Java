package com.codecounty.dsa.dp;

public class CoinChangeTwo {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        int result = coinChange(coins, amount);
        System.out.println(result);
    }
    private static int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length+1][amount+1];
        dp[0][0] = 1;
        for(int i=1;i<=coins.length;i++) {
            dp[i][0] = 1;
        }
        for(int i=1;i<=coins.length;i++) {
            for(int j=1;j<=amount;j++) {
                // first case - if the denomination is greater than amount
                if(coins[i-1] > j) {
                    dp[i][j] = dp[i-1][j];
                }
                else {
                    // second case
                    dp[i][j] = dp[i-1][j] + dp[i][j-coins[i-1]];
                }
            }
        }
        return dp[coins.length][amount];
    }
    // Recursive Code
    private int helper(int[] coins, int idx, int amount) {

        if(coins.length == idx || amount < 0) return 0;
        if(amount == 0) return 1;
        // Don't 'choose
        int case1 = helper(coins, idx+1 , amount);
        // Choose
        int case2 = helper(coins, idx, amount-coins[idx]);

        return case1+case2;
    }
}
