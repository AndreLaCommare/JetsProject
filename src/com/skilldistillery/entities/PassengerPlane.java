package com.skilldistillery.entities;

import java.text.DecimalFormat;

public class PassengerPlane extends Jet implements PassengersLoaded {
	public PassengerPlane() {

	}

	public PassengerPlane(String model, double speed, int range, long price) {
		super(model,speed, range, price);
		
	}

	@Override	
	public void load() {
		System.out.println("The passengers are loaded onto the "+ this.getModel()
		+" the passports and boarding passes are scanned at the gate.");
	}

	@Override
	public void fly() {
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("The " + this.getModel() +" accelerates slowly and steadily to a cruising altitude of 35,000 ft. For a max flight time of " + df.format(this.getRange()/this.getSpeed()) + " hours.");
	}
}
