package com.codecounty.java.core.oops.poject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Elevator {
	private static final int MIN_FLOOR = 0;
	private static final int MAX_FLOOR = 8;

	private static int processingTime = 500;
	private int currentFloor;
	private Direction currentDirection;

	// Functioning of List
	private Map<Integer, List<Integer>> requestedPathMaps;// K 4: 6,7
	private Boolean[] currentFloorDestination;

	public Elevator() {
		this.currentFloor = 0;
		this.currentDirection = Direction.UP;
		this.requestedPathMaps = new HashMap();
		this.currentFloorDestination = new Boolean[MAX_FLOOR + 1];
		Arrays.fill(currentFloorDestination, false);
	}

	public void start() throws InterruptedException {
		this.currentDirection = Direction.UP;
		do {
			System.out.println("---" + currentFloor + "---");
			processFloor(currentFloor);
			System.out.println("---" + currentFloor + "---");

		} while (currentDirection != Direction.IDLE);

	}

	/* it will enrich the detinations from a single floor */
	public void callElevator(int start, int destination) {
		if (isInvalidFloor(start) || isInvalidFloor(destination) || start == destination) {
			System.out.println("Invalid Floors , try Again");
			return;
		}
		if (requestedPathMaps.containsKey(start)) {// 3,3 7,2
			requestedPathMaps.get(start).add(destination);

		} else {
			requestedPathMaps.put(start, new ArrayList() {
				{
					add(destination);
				}
			});
		}

	}

	private void processFloor(int floor) throws InterruptedException {// 6
		if (currentFloorDestination[floor]) {
			System.out.println("Un Boarding from the Lift at floor :: " + floor);
		}
		if (requestedPathMaps.containsKey(floor)) {//
			System.out.println("Boarding At Floor " + floor);
			requestedPathMaps.get(floor).forEach(destinationFloor -> currentFloorDestination[destinationFloor] = true);
			requestedPathMaps.remove(floor);

		}
		currentFloorDestination[floor] = false;
		moveElevator();

	}

	private void moveElevator() throws InterruptedException {
		if (!Arrays.asList(currentFloorDestination).contains(true) && requestedPathMaps.isEmpty()) {// condition foe
																									// lift to ibe IDLE
			currentDirection = Direction.IDLE;
			return;
		} else if (isInvalidFloor(currentFloor + 1)) {
			currentDirection = Direction.DOWN;

		} else if (isInvalidFloor(currentFloor - 1)) {
			currentDirection = Direction.UP;

		}

		switch (currentDirection) {
		case UP:
			moveUp();
			break;
		case DOWN:
			moveDown();
			break;
		default:
			System.out.println("Elevatoir Malfunctioned");
			break;
		}

	}

	private void moveDown() throws InterruptedException {
		--currentFloor;
		System.out.println("Going Down to " + currentFloor);
		Thread.sleep(processingTime);

	}

	private void moveUp() throws InterruptedException {
		++currentFloor;
		System.out.println("Going Up to " + currentFloor);
		Thread.sleep(processingTime);

	}

	private boolean isInvalidFloor(int floor) {
		return floor < MIN_FLOOR || floor > MAX_FLOOR;
	}

}
