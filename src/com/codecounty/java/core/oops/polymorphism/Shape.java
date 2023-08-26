package com.codecounty.java.core.oops.polymorphism;

public class Shape {

	double areaOfACircle(double radius) {
//		return 3.14159 * radius * radius;
		return Math.PI * radius * radius;
	}

	int areaOfASquare(int side) {
		return side * side;
	}

	float areaOfARectangle(int length, float breadth) {
		return length * breadth;
	}

	float areaOfATriangle(int base, float height) {
		return 0.5f * base * height;
	}

}
