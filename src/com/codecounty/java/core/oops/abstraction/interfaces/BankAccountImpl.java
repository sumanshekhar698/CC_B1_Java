package com.codecounty.java.core.oops.abstraction.interfaces;

import java.util.logging.Logger;

public class BankAccountImpl extends IndianGovt implements BankAccount, LocalLaws {

	int balance;
	public Logger logger = Logger.getLogger(BankAccountImpl.class.getName());

	public BankAccountImpl(int balance) {
		super();
		this.balance = balance;
	}

	@Override
	public float withdrawFromATM(float amount) {

		if (amount > balance) {
//			System.out.println("Insufficient Balance");
			logger.info("Insufficient Balance");
			return 0.0f;

		} else {
			balance -= amount;
			logger.info("Amount Debited :: " + amount);

			return amount;
		}
	}

	@Override
	public void sayMyBalance() {
		System.out.println("Balance :: " + balance);
	}

	void sayIFSCOfBank() {
		System.out.println("IFSC :: " + BankAccount.IFSC_CODE);

	}

	@Override
	public void followLaw() {
		System.out.println("Follow tha law of the land");

	}

	@Override
	public void isApproved() {
		System.out.println("Waiting approval");

	}

}
