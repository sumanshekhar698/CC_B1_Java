package com.codecounty.java.core.oops.inheritance;

public class TypeCasting {

	public static void main(String[] args) {

		Child c1 = new Child();//
		c1.khushi();

		Parent p1 = c1;// Upcastimg// INCREASING
		c1.khushi();

//		p1.khushi();
		p1.test();

		Child c0 = (Child) p1;// Downcastin //DECRESASING

		Parent p2 = new Child();// Upcasting (Upcastingis implicit)
//		p2.khushi();

		Parent p3 = new Parent();
		if (p3 instanceof Child) {
			Child c3 = (Child) p3;// Downcasting TypeCastingError
		}

		Parent p4 = new Child();// Upcasting
//		p4.khushi();

		if (p4 instanceof Child) {// Downcasting condition
			Child c4 = (Child) p4;// Downcasting
			c4.khushi();// You can downcast only taht object which is already upcasted
		}

	}

}

class Parent {

	int p;

	void test() {
		System.out.println("Test Parent");
	}
}

class Child extends Parent {

	int q;

	void khushi() {
		System.out.println("Child class dummy");
	}
}
