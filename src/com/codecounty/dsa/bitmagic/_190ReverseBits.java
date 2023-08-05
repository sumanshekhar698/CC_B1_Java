package com.codecounty.dsa.bitmagic;

public class _190ReverseBits {
//	https://leetcode.com/problems/reverse-bits/?envType=study-plan-v2&envId=top-interview-150

	public static void main(String[] args) {

		int n = 19;

//		O(1) Constant Time
//		O(1) Constant Space

		int result = 0, bit;
		for (int i = 0; i <= 31; i++) {
			bit = (n >> i) & 1;

//			Say the bit I got is 1
			result = result | (bit << (31 - i));

		}

		System.out.println(result);

	}

}
