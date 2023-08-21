package com.codecounty.dsa.arrays;

public class _122BestTimeToBuyAndSellStockII {
//	https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
	public static void main(String[] args) {

		int[] nums = { 1, 5, 3, 8, 12 };
		int profit = maxProfit(nums);
		System.out.println(profit);

	}

	public static int maxProfit(int[] prices) {

		int profit = 0;
//		 8.6.4.2.1

//		Time O(n) 
//		Space O(n) = 1
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				profit += (prices[i] - prices[i - 1]);
			}
		}

		return profit;

	}

}
