package com.codecounty.java.core.oops.encapsulation;

public class Student {

	private int id;
	private String name;
	private String collegeName;

	public Student(int id, String name, String collegeName) {
		this.id = id;
		this.name = name;
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", collegeName=" + collegeName + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	

}
