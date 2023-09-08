package com.codecounty.java.core.oops.inheritance;

public class TennisPlayer extends Player {// childClass/BaseClass extends Parent/Super class

	int matchesPlayed;
	int wimbeldonWon;
	int frenchOpenWon;
	int worldRanking;

	public TennisPlayer(int matchesPlayed, int wimbeldonWon, int frenchOpenWon, int worldRanking) {
		super();//super method is used to invoke parent constructor | super() should be the 1st statement inside a connstructor
		this.matchesPlayed = matchesPlayed;
		this.wimbeldonWon = wimbeldonWon;
		this.frenchOpenWon = frenchOpenWon;
		this.worldRanking = worldRanking;
	}

	public TennisPlayer(String name, Gender gender, int age, float height, float weight, int matchesPlayed,
			int wimbeldonWon, int frenchOpenWon, int worldRanking) {
//		this(matchesPlayed,wimbeldonWon,frenchOpenWon,worldRanking);//this() and super() cannot be used together
		super(name, gender, age, height, weight);
		this.matchesPlayed = matchesPlayed;
		this.wimbeldonWon = wimbeldonWon;
		this.frenchOpenWon = frenchOpenWon;
		this.worldRanking = worldRanking;
	}

	@Override
	public String toString() {
		return "TennisPlayer [matchesPlayed=" + matchesPlayed + ", wimbeldonWon=" + wimbeldonWon + ", frenchOpenWon="
				+ frenchOpenWon + ", worldRanking=" + worldRanking + ", name=" + name + ", gender=" + gender + ", age="
				+ age + ", height=" + height + ", weight=" + weight + "]";
	}

}
