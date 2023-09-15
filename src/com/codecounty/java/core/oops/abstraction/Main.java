package com.codecounty.java.core.oops.abstraction;

public class Main {

	public static void main(String[] args) {

		BankAccount b1 = new BankAccount("Devyani", 567898);

//		System.out.println(b1.balance);
		float withdrawFromATM = b1.withdrawFromATM(50);
//		System.out.println(withdrawFromATM);
//		System.out.println(b1.balance);

//		SafeBank b2 = new SafeBank();// You cannot create an object DIRECTLY of a Abstract class

		SafeBankAccount b3 = new SafeBankAccount() {// Annonymouus Inner Classes

			@Override
			float withdrawFromATM(float amount) {
				if (amount > balance) {
//					System.out.println("Insufficient Balance");
					logger.info("Insufficient Balance");
					return 0.0f;

				} else {
					balance -= amount;
					logger.info("Amount Debited :: " + amount);

					return amount;
				}
			}
		};

		b3.withdrawFromATM(10);

		SafeBankAccountImpl b4 = new SafeBankAccountImpl();
		b4.balance = 1000;
		b4.name = "Khushi";
		b4.withdrawFromATM(300);
		b4.sayMyBalance();
		b4.test();

		SafeBankAccount b4Up = b4;
//		b4Up.test();

	}

}
