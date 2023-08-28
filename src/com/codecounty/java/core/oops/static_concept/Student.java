package com.codecounty.java.core.oops.static_concept;

public class Student {// CBSE

	int id;// instance variables are object specific
	String name;
	String school;
	static String educationBoard;// null [Static things are not object level rather they are class leve]

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", school=" + school + "]";
	}

	public Student(int id, String name, String school) {
		this.id = id;
		this.name = name;
		this.school = school;
	}

}
