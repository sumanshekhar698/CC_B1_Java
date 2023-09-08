package com.codecounty.java.core.oops.inheritance;

public class Main {

	public static void main(String[] args) {

		TennisPlayer mariaSharapowa = new TennisPlayer(79, 3, 5, 2);
		System.out.println(mariaSharapowa);
		mariaSharapowa.gender = Gender.FEMALE;
		System.out.println(mariaSharapowa.gender);

		TennisPlayer rogerFeddrer = new TennisPlayer("Roger Federrer", Gender.MALE, 40, 5.9f, 65.7f, 90, 7, 5, 1);
		System.out.println(rogerFeddrer);
		rogerFeddrer.sayMyName();
		
		CricketPlayers viratKohli = new CricketPlayers("Virat Kohli", Gender.MALE, 45, 5.11f, 75.6f, 378, 270);
		System.out.println(viratKohli);
	
		
	}

}
