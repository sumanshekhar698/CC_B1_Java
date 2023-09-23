package com.codecounty.java.core.oops.abstraction;

import java.util.logging.Logger;

//achieve abstraction 0 - 100%
public abstract class SafeBankAccount {// class has to be made abstract if any abstract methdos exists

	public Logger logger = Logger.getLogger(SafeBankAccount.class.getName());

	String name;
	int acNo;
	float balance;

	abstract float withdrawFromATM(float amount);// abstract methods/fn are functyions without body

	void sayMyBalance() {// concrete methods
		logger.info("" + this.balance);
	}
}

abstract class Sample {

}