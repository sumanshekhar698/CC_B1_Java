package com.codecounty.java.core.oops.abstraction;

import java.util.logging.Logger;

public class BankAccount {

	private Logger logger = Logger.getLogger(BankAccount.class.getName());

	String name;
	int acNo;
	float balance;

	public BankAccount(String name, int acNo) {
		super();
		this.name = name;
		this.acNo = acNo;
		this.balance = 1000;
	}

	float withdrawFromATM(float amount) {

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

}
