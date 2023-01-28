package com.skilldistillery.entities;

public class PassengerPlane extends Jet implements PassengersLoaded{
	public PassengerPlane () {
		
	}
	public PassengerPlane(String name, double speed, int range, long price) {
		super();
		//PassengersLoaded(); (?)
	}
	
	public abstract void load();
}
