package com.codecounty.java.core.oops.inheritance;

public class Player {// By default A class exxtends Object class if it is not extending any other
						// class

	String name;
	Gender gender;// Male/Female/Others
	int age;
	float height;
	float weight;

	public Player(String name, Gender gender, int age, float height, float weight) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	void sayMyName() {
		System.out.println("NAME :: " + this.name);
		return;
//		return 7;
	}

}
