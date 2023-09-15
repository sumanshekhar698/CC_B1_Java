package com.codecounty.java.core.oops.inheritance;

public class TypecastingRevision {

	public static void main(String[] args) {

		Train t1 = new Train();
		t1.maxSpeed = 155;

		if (t1 instanceof VandeBharat) {
			System.out.println("Dwn 1");
			VandeBharat v1 = (VandeBharat) t1;// If the original object is of parent, cannot downcast it to any of
												// child
			System.out.println(v1);
		}

		Train t2 = new VandeBharat();// Upcasting
		t2.maxSpeed = 200;

		if (t2 instanceof VandeBharat) {
			System.out.println("Dwn 2");
			VandeBharat v2 = (VandeBharat) t2;
//		v2.ratings = 5;
			v2.giveRating(5);
			v2.sayMyMaxSpeed();
		}

	}

}

class Train {

	int maxSpeed;
	int noOfCoaches;

	void sayMyMaxSpeed() {
		System.out.println("MAX Speed :: " + maxSpeed);
	}
}

class VandeBharat extends Train {

	int ratings;
	int timings;

	void giveRating(int ratings) {
		this.ratings = ratings;
		System.out.println("Rating set to :: " + this.ratings);
	}

}
