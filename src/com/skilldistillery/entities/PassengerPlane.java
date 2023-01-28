package com.skilldistillery.entities;

public class PassengerPlane extends Jet implements PassengersLoaded {
	public PassengerPlane() {

	}

	public PassengerPlane(String model, double speed, int range, long price) {
		super();
		// PassengersLoaded(); (?)
	}

	@Override	
	public void load() {
		System.out.println("The passengers are loaded as the passports and boarding passes are scanned at the gate.");
	}

	@Override
	public void fly() {
		System.out.println("The  passenger plane accelerates slowly and steadily to a cruising altitude of 35,000 ft.");
	}
}
