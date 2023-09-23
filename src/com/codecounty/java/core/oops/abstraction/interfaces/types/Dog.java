package com.codecounty.java.core.oops.abstraction.interfaces.types;


@FunctionalInterface
public interface Dog {//inteface having exactly 1 abstratc method are called Functional Interface

	void bark();// 1

	static void dogsAreGoodAnimal() {
		System.out.println("YESSSS");
	}

	default void dogsAreLoyalAnimal() {
		System.out.println("YESSSS");
	}

}
