package com.codecounty.java.core.oops.abstraction;

public class SafeBankAccountImpl extends SafeBankAccount {

	@Override
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

	void test() {
		logger.info("Testing");
	}

}
