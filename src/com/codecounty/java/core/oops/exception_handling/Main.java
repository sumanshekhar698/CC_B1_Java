package com.codecounty.java.core.oops.exception_handling;

public class Main {

	public static void main(String[] args) {

		// UNCHECK EXCEPTIONS :: Aritmetic, ArrayIndexOutOfBoundsException [Optional to handle]
//		System.out.println(6/0);//DEH

		for (int i = 0; i <= 7; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {// InterruptedException => Checked Exception [You my=ust handle this
												// things]
				e.printStackTrace();
			} // 0.5 second
			System.out.println(i);
		}
		System.out.println("END");
	}

}
