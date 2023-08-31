package com.codecounty.java.core.oops.static_concept;

public class Employee {

	String name;
	String ID;// EMP1 , EMP2
	private static int counter = 0;

	private Employee(String name, String iD) {
		this.name = name;
		ID = iD;
	}

	public Employee(String name) {
		this.name = name;
		this.ID = "EMP" + ++counter;
	}

	@Override
	public String toString() {
		return "Enployee [name=" + name + ", ID=" + ID + "]";
	}

}
