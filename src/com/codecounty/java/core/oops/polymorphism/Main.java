package com.codecounty.java.core.oops.polymorphism;

public class Main {

	public static void main(String[] args) {

		Shape shape = new Shape();
		System.out.println(shape.areaOfACircle(5.8));
		System.out.println(shape.areaOfASquare(5));
		System.out.println(shape.areaOfARectangle(10, 5.6f));
		System.out.println(shape.areaOfATriangle(10, 5.6f));

//		Polymorphic Shape Area
		ShapePolymorphic shapePolymorphic = new ShapePolymorphic();
		System.out.println(shapePolymorphic.area(5.8));
		System.out.println(shapePolymorphic.area(5));
		System.out.println(shapePolymorphic.area(10, 5.6f));
		System.out.println(shapePolymorphic.area(5.6f, 10));

		System.out.println();
		System.out.println(2);
		System.out.println("two");
		System.out.println(true);

	}

}
