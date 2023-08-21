package com.codecounty.java.core.oops.encapsulation;

public class Scientist {

	String name;
	int age;//no explicit access specifies means default access
	int skillLevelOnAScaleOf10;
	int experience;
	private String projectHandling;//private things can ONLY be accessed within the class

	public Scientist(String name, int age, int skillLevelOnAScaleOf10, int experience, String projectHandling) {
		this.name = name;
		this.age = age;

		if (skillLevelOnAScaleOf10 < 0)
			this.skillLevelOnAScaleOf10 = 0;
		else if (skillLevelOnAScaleOf10 > 10)
			this.skillLevelOnAScaleOf10 = 10;

		this.skillLevelOnAScaleOf10 = skillLevelOnAScaleOf10;
		this.experience = experience;
		this.projectHandling = projectHandling;
	}

	@Override
	public String toString() {
		getMyName();
		return "Scientist [name=" + name + ", age=" + age + ", skillLevelOnAScaleOf10=" + skillLevelOnAScaleOf10
				+ ", experience=" + experience + ", projectHandling=" + projectHandling + "]";
	}
	
	private void getMyName(){
//		private int x; //INVALID
		System.out.println(this.name);
	}



}
