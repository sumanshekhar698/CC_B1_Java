package com.codecounty.java.core.oops.inheritance;

public class RuntimePolumorphism {
	public static void main(String[] args) {

		new M().test();//Testing M

		new N().test();//Testing N

	}
}

class M {//Running the code :: Runtime Polymorphism

	void test() {
		System.out.println("Testing M");
	}
}

class N extends M {

	@Override
	void test() {
		System.out.println("Testing N");
	}
}
