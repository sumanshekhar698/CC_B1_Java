package com.codecounty.dsa.bitmagic;

public class FindTheRightMostSetBit {

	public static void main(String[] args) {

		int n = 10, bit = 0;

		// O(1) Constant Time
		// O(1) Constant Space
		for (int i = 0; i <= 31; i++) {// iterating 32 times

			bit = (n >> i) & 1;

			if (bit == 1) {// if bit == 1
				System.out.println(i);
				break;
			}

		}
		if (bit == 0)// 0 has no set bits
			System.out.println("No Set Bits");

	}

}
