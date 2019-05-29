package com.techelevator;

public class Elevator {
	private int currentFloor;
	private int numberOfFloors;
	private boolean doorOpen;
	
	public int getCurrentFloor() {
		return currentFloor;
	}
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	public boolean isDoorOpen() {
		return doorOpen;
	}
	public Elevator(int totalNumberOfFloors) {
		numberOfFloors = totalNumberOfFloors;
		currentFloor = 1;
	}
	public void openDoor() {
		doorOpen = true;
	}
	public void closeDoor() {
		doorOpen = false;
	}
	public void goUp(int desiredFloor) {
		if (doorOpen == false){
			if (desiredFloor <= numberOfFloors) {
				if (desiredFloor > currentFloor) {
					currentFloor = desiredFloor;
				}
			}
		}
	}
	public void goDown(int desiredFloor) {
		if (doorOpen == false) {
			if (desiredFloor >= 1 ) {
				if (desiredFloor < currentFloor){
					currentFloor = desiredFloor;
				}
			}
		}
	}
}
