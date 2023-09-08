package com.codecounty.java.core.oops.inheritance;

//public class A extends B {//Circular inheritance is not allowed 
//}

//class B extends A,Player {//Mutilple Inheritance is not allowed
//
//}

final class X {// final classes are never inherited

}

class A {// Object
	int x = 88;
	int y = 99;

	int valueOfX() {
		return x;
	}

	int valueOfY() {
		System.out.println("class A");
		return y;
	}

}

class B extends A {
	int x = 87;
	int y = 98;

	@Override
	int valueOfY() {
		System.out.println("class B");
		return y;
	}

	private void inClassB() {// specialized methods ALSO private methosd and variable are not inherited
		System.out.println("inClassB");
		super.valueOfY();
	}

}

class C extends B {// Multi Level Inheritance is allowed
	int x = 86;
	int y = 97;

	int valueOfX() {
		System.out.println(super.x);// super keyword is used to access things of IMMEDIATE Parent
		return x;
	}

}

public class MainInheritance {
	public static void main(String[] args) {
		C c = new C();
		int x = c.valueOfX();
		System.out.println(x);// 88

		B b = new B();
		System.out.println(b.y);
		int y = b.valueOfY();
		System.out.println(y);

	}
}
