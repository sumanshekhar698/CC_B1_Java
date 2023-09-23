package com.codecounty.java.core.oops.abstraction.interfaces.types;

public class Main {

	public static void main(String[] args) {

		Dog chiua = new Dog() {

			@Override
			public void bark() {
				System.out.println("bark slowly");

			}
		};

		Dog germanShephard = () -> {// lambda fn ia ONLY applicable on Functional Interfaces
			System.out.println("barks fiercly");
		};

	}

}

class GreatBernard implements Dog {

	@Override
	public void bark() {
		System.out.println("Barks loudly");

	}

}
