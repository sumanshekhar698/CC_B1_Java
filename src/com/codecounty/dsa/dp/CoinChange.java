package com.codecounty.dsa.dp;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        int result = coinChange(coins, amount);
        System.out.println(result);
    }
    private static int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length+1][amount+1];
        dp[0][0] = 0;
        for(int j=1;j<=amount;j++) {
            dp[0][j] = 99999;
        }
        for(int i=1;i<=coins.length;i++) {
            for(int j=1;j<=amount;j++) {
                // first case - if the denomination is greater than amount
                if(coins[i-1] > j) {
                    dp[i][j] = dp[i-1][j];
                }
                else {
                    // second case
                    dp[i][j] = Math.min(dp[i-1][j] , 1 + dp[i][j-coins[i-1]]);
                }
            }
        }
        if(dp[coins.length][amount] == 99999)
            return -1;

        return dp[coins.length][amount];
    }
    // Recursive Code
    private int helper(int[] coins, int idx, int amount, int coinsUsed) {

        if(coins.length == idx || amount < 0) return -1;
        if(amount == 0) return coinsUsed;
        // Don't 'choose
        int case1 = helper(coins, idx+1 , amount, coinsUsed);
        // Choose
        int case2 = helper(coins, idx, amount-coins[idx], coinsUsed+1);

        if(case1 == -1) return case2;
        if(case2 == -1) return case1;

        return Math.min(case1, case2);
    }
}
