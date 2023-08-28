package com.codecounty.java.core.oops.static_concept;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student(1, "Goku", "DPS");
		Student.educationBoard = "ICSE";
		System.out.println(s1.educationBoard);// ICSE [static variables can be accessed via object reference ✅]
		System.out.println(Student.educationBoard);// ICSE [static variables are recommende to be accessed via class
													// name]

		s1.educationBoard = "CBSE";
		System.out.println(s1.educationBoard);// CBSE

		Student s2 = new Student(2, "Gohan", "DAV");
		System.out.println(s2.educationBoard);// CBSE

		s2.educationBoard = "SSC";
		System.out.println(s2.educationBoard);// SSC

		Student s3 = new Student(3, "Vigieta", "VIKAS");
		System.out.println(s3.educationBoard);// SSC
		System.out.println(Student.educationBoard);// SSC [static variables can be directly accessed via class names, no
													// need to create objects]

		s2.id = 8;
		System.out.println(s1.id);

	}

}
