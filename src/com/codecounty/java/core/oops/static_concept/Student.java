package com.codecounty.java.core.oops.static_concept;

public class Student {// CBSE

	int id;// instance variables are object specific
	String name;
	String school;
	static String educationBoard = "CBSE";// null [Static things are not object level rather they are class leve]

	{// generally used to initialize static things
		System.out.println("Static block executed 0");
	}

	static {// generally used to initialize static things
		educationBoard = "CBSE";
		System.out.println("Static block executed 1");
	}

	static {// generally used to initialize static things

		System.out.println("Static block executed 2");
	}

//	

	// Static things can be accessed form non static things DIRECTLY but not the
	// vice verse

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", school=" + school + "]";
	}

	public Student(int id, String name, String school) {
		this.id = id;
		this.name = name;
		this.school = school;
		System.out.println("Student constructor executed");

	}

	void sayMyEducationBoard() {
		System.out.println(Student.educationBoard);
	}

	static void sayMyName() {
		int x;// static keyword is not applciable for local variables
//		System.out.println(this.name);//Static things are loaded to memory before object creation for that reasom ypu cannot access non static instance variabsles/function directly

	}

}
