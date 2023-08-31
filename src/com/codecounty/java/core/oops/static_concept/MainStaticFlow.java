package com.codecounty.java.core.oops.static_concept;

public class MainStaticFlow {

	public static void main(String[] args) {

		
		//Static things are loaded to memory before object creation
		Student s1 = new Student(1, "Goku", "DPS");
//		Student.educationBoard = "ICSE";
		System.out.println(s1.educationBoard);// ICSE [static variables can be accessed via object reference ✅]
		System.out.println(Student.educationBoard);// ICSE [static variables are recommende to be accessed via class
													// name]


	}

}
