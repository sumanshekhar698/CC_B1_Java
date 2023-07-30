package com.codecounty.dsa.bitmagic;

public class FindTheLeftMostSetBit {

	public static void main(String[] args) {

		int n = 11, position = 0;// set bit is a bit with value 1

//		00000000 00000000 00000000 00001011

//		00000000 00000000 00000000 00000101   = 1
//		00000000 00000000 00000000 00000010   = 2
//		00000000 00000000 00000000 00000001   = 3
//		00000000 00000000 00000000 00000000   = 4

		// 4th position

		while (n > 0) {
			n = n >> 1;
			position++;
		}
		
		System.out.println(position);

	}

}
