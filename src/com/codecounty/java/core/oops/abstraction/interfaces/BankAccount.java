package com.codecounty.java.core.oops.abstraction.interfaces;

public interface BankAccount extends RBI {

	public static final int IFSC_CODE = 70909;// by default it is public static final
	// all the methods should be abstract

	abstract float withdrawFromATM(float amount);// abstract methods/fn are functyions without body

	void sayMyBalance();// abstract keyword is optional

//	JDK 8
	static void sayMyIFSC() {// you can have concrete static methods
		System.out.println(IFSC_CODE);
	}

	default void test() {// you can have concrete default methods
		System.out.println("testing");
	}

}
