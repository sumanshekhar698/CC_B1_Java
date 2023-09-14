package com.codecounty.java.core.oops.inheritance;

public class InheritanceAndStaticConcept {

	public static void main(String[] args) {

		A a = new A();
		Sample sample = new Sample();
		B b = new B();
		int x = b.x;

		int y = b.y;// Static things take part in Inheritance
//		b.testA();
//
//		System.out.println(A.y);
//		A.testA();

		B.testA();
		A.testA();
//		System.out.println(B.y);

		B.testing();

	}

	static class A {// inner classes

		int x;
		static int y;

		static void testA() {

			if (8 % 2 == 0)
				System.out.println("A");
		}
	}

	static class B extends A {// inner classes

//		@Override //Ovvevriding a static fun is not possible rather Method Hiding occurs
		static void testA() {// Method Hiding
			System.out.println("B");
		}

		static void testing() {
			System.out.println("testing");
		}
	}
}

class Sample {

}
