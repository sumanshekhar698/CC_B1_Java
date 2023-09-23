package com.codecounty.java.core.oops.abstraction.interfaces;

public class Main {

	public static void main(String[] args) {

		BankAccountImpl ac1 = new BankAccountImpl(500);
		ac1.sayIFSCOfBank();
		ac1.sayMyBalance();

		BankAccount ac2 = new BankAccount() {

			@Override
			public float withdrawFromATM(float amount) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void sayMyBalance() {
				// TODO Auto-generated method stub

			}

			@Override
			public void isApproved() {
				// TODO Auto-generated method stub

			}
		};

	}

}
