package com.codecounty.dsa.basics;

public class ArmstrongNumber {

	public static void main(String[] args) {

		// 153 ? 3
		// 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

//		4233/10 = 423
		int n = 153;
		int temp = n;
		int numberOfDigits = 0;// 4

//		Time complexity
//		Best Case
//		Average Case
//		*Worst Case = log10(n) = O(log(n))

//		Space Complexity
//		Best Case
//		Average Case
//		*Worst Case = 1 = O(1)

		// 1st To calculate no of digits
//		while (temp > 0) {
//			temp = temp / 10;// 0
//			++counter;// 4
//		}

		numberOfDigits = (int) Math.log10(n) + 1;// Standard Maths formula to calculate number of Digits // O(n) = 1
		System.out.println(numberOfDigits);

		// 2nd Calculatimg tyhe sum of each digits raise to their power of counter
		temp = n;
		int digit = 0;
		int sum = 0;
		//n = 153 = temp :
		while (temp > 0) {// O(n) = log10(n) + 1
			digit = temp % 10;// 3
			sum = sum + (int) Math.pow(digit, numberOfDigits);
			temp /= 10;
		}

		// 3rd step I am comparing the sume with the original number
		if (sum == n)
			System.out.println("Armstrong");
		else
			System.out.println("Not a Armstrong");

		System.out.println(numberOfDigits);

	}

}
