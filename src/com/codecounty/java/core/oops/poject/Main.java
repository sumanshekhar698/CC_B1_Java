package com.codecounty.java.core.oops.poject;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		int start = 2;
		int destination = 4;
		
		Elevator elevator = new Elevator();
		elevator.callElevator(start, 4);
		elevator.callElevator(start, 7);

		elevator.start();
		

	}

}
