package com.codecounty.java.core.basics;

public class PrimitveVariablesQuestions {

	public static void main(String[] args) {

		byte a = 88;
		int b = 7;
//		a = b;// 8bit = 32 bit
		long d = b;
		long phoneNumber = 9006567388L;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(a);

		float pi = 3.14145f;
		pi = phoneNumber;// integer are stored in memory using a very simple algo //EXCEPTIONAL CASE
//		floaing point are stored using an Alogrihm called IEEE
		System.out.println(pi);

		char ch1 = 'a', ch2 = '"';

//		char ch3 = ch1 + ch2;
		int ch1Ascii = ch1;
		System.out.println(ch1Ascii);

		int sample = 169;
		char sammpleCharacter = (char) sample;
		System.out.println(sammpleCharacter);

	}

}
