package com.codecounty.java.core.oops.inheritance;

public class CricketPlayers extends Player {
	int matchesPlayed;
	int matchesWon;

	public CricketPlayers(String name, Gender gender, int age, float height, float weight, int matchesPlayed,
			int matchesWon) {
		super(name, gender, age, height, weight);
		this.matchesPlayed = matchesPlayed;
		this.matchesWon = matchesWon;
	}

	@Override
	public String toString() {
		return "CricketPlayers [matchesP1ayed=" + matchesPlayed + ", matchesWon=" + matchesWon + ", name=" + name
				+ ", gender=" + gender + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}

}