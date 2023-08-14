package com.codecounty.dsa.arrays;

public class _121BestTimeToBuyAndSellStock1 {

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };

		int profit = maxProfitLinear(prices);
		System.out.println(profit);

	}

	static int maxProfitBrute(int[] prices) {
		int maxProfit = 0;

//		Time O(n) = n..+6+5+4+3+ 2+ 1 ~ n(n+1)/2 ~ (n^2)/2 + n/2  ~ (n^2)/2  ~ (n^2)
//		Space O(n) = 1
		for (int i = 0; i < prices.length; i++) {
			for (int j = i; j < prices.length; j++) {
				maxProfit = Integer.max(maxProfit, (prices[j] - prices[i]));
			}
		}

		return maxProfit;
	}
	
	static int maxProfitLinear(int[] prices) {
		int maxProfit = 0, 
				min = prices[0];

//		Time O(n) = n
//		Space O(n) = 1
		for (int i = 0; i < prices.length; i++) {
			min = Integer.min(min, prices[i]);
			maxProfit = Integer.max(maxProfit, prices[i] - min);
			
		}

		return maxProfit;
	}

}
