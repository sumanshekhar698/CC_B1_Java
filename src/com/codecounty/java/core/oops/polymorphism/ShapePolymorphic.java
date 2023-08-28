package com.codecounty.java.core.oops.polymorphism;

public class ShapePolymorphic {

//	all the name of the polymorphic functions should be same
//	1. Are they having same number of parameters ?
//	2. Are they having same parameter type ?
//	3. Are they having same position ?

//	Polymorphism
//	1. Compile Time (method overloading)
//	*2. Runtime (method overriding)

	// area method/fn is overloaded
	double area(double radius) {
//		return 3.14159 * radius * radius;
		return Math.PI * radius * radius;
	}

	int area(int side) {
		return side * side;
	}

	float area(int length, float breadth) {
		return length * breadth;
	}

	float area(float height, int base) {
		return 0.5f * base * height;
	}

}
