package com.codecounty.java.core.oops.encapsulation;

public class Main {

	public static void main(String[] args) {
		Scientist s1 = new Scientist("Mathews", 30, 12, 10, "Smart Glass");
		
//		s1.projectHandling = "Sinchan";
		
		
		System.out.println(s1);
//		System.out.println(s1.name);
//		System.out.println(s1.age);
//		System.out.println(s1.skillLevelOnAScaleOf10);
//		System.out.println(s1.experience);
//		System.out.println(s1.projectHandling);

		Student st1 = new Student(2, "Rocky", "Sri Ram College");
		System.out.println(st1);
		System.out.println(st1.getName());
		st1.setCollegeName("Presidency College");
		System.out.println(st1);



	}

}
