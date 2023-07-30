package com.codecounty.java.core.basics;//R1: pacgage declaration is must

//RULES : Must use guidelines
//STANDARDS : Good Habits
public class BasicPrimitiveVariables {// R2: class name should exactly match with file name and should have number in
										// the begining
//	S1: class name should be in Pascal Case

	public static void main(String[] args) {

		// KEYWORDS - reserved words

		// Primitive Vraiables
//		Integers  0 ,-4, 77

		byte x;// decalaring
		x = 99;
		System.out.println(x);
		byte a = 32;// declaring and initialising

		short b = 78;
		int c = 787;// = is called assingment operator
//		R3: Cannot use keywords as variable names, variable name has no length limit,
		// variable name can contain numbers but should not start with numbers
		// two variable cannot have same name
		int $ = 7;// variable name can have $
		int _ = 7;// variable name can have _
		long d = 43;
		long phoneNumber = 9006567388L;// S2: variable name should follow camelCase and it should have a sensible name

//		Decimals | Floating Point Numbers
//		3.13159
		float valueOfPi = 3.14159f;// By default all floating point numbers are considereed as double
		double valueOfPie = 3.14159;

		// Boolean
		boolean isJavaEasy = true, isDSAHard = false;

//		charater
		char m = 'b';// characte data type can store a single character
		System.out.println(m);

	}

}

//CASES
// tomisagoodcat : small/lower case
//TOMISAGOODCAT : UPPERCASE
//TomIsAGoodCat : PascalCase*
//tomIsAGoodCat : camelCase*
//tom_is_a_good_cat : snake_case PYTHON
//TOM_IS_A_GOOD_CAT : CAPITAL_SNAKE_CASE*
//tom-is-a-good-cat : kebab-case
