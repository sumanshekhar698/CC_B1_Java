package com.codecounty.java.core.basics;

public class OperatorsInJava {

	public static void main(String[] args) {

		int x = 8;// = that is called assingment equator

//		unary operators
//		x = x + 1;
		x++;// post increment
		System.out.println(x);// 9
		System.out.println(x++);// 9
		System.out.println(x);/// 10
		System.out.println(x++);// 10
		System.out.println(x);// 11
		System.out.println(++x);// pre increment 12
		System.out.println(x);// 12

		System.out.println(--x);// 11
		System.out.println(x--);// 11
		System.out.println(x);// 10

//		x = 10
//		9 + 10 - 9 - 10 - 10 + 11 = 1
		x = --x + ++x - --x - ++x - x++ + x--;
		System.out.println(x);

//		Shorthand Operators
		x = 100;
		x = x * 2;
		x *= 2;
		System.out.println(x);// 400
		x %= 6;
		System.out.println(x);// 4

//		Arithmetic Operators +-%*/

//		Coparison Operators   >  <  >= <=  == !=
//		Logical Operators  || -> Logical OR   
//		&& -> Logical And
//		! -> Logical Not 
		if (x % 2 == 0 && x >= 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		x = 5;
		if (!(x % 2 == 0)) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}

//		Rotation Concept in Java
		int m = Integer.MAX_VALUE;
		System.out.println(m);// 2147483647
		System.out.println(Integer.MIN_VALUE);// -2147483648
		// Range of Integer [ -2147483648 ..... 0 ...... +2147483647]
		++m;
		System.out.println(m);// -2147483648
		m += 5;
		System.out.println(m);// -2147483643

		m -= 10;
		System.out.println(m);// 2147483643 par

//		Bit wise Operators
		System.out.println(8 & 10);// Bitwise AND
		System.out.println(65 | 28);// 93 Bitwise OR
//		65 = 1000001
//		28 = 11100

		System.out.println(65 ^ 78);// Bitwise XOR
		System.out.println(-65 ^ 78);// Bitwise XOR
		System.out.println(87 ^ 87);// 0
		System.out.println(~15);// Negation / Compliment Operator

		// Shifting Bit Wise Operators
		System.out.println(8 << 2);// 8 * 2 *2 | Left Shift
		System.out.println(8 >> 2);// 8 / 2 /2 | *Signed Right Shift
		
		System.out.println(-8 >> 1);// 8 / 2 /2 | *Signed Right Shift
		System.out.println(-8 >>> 1);// 8 / 2 /2 | *UnSigned Right Shift




	}

}
