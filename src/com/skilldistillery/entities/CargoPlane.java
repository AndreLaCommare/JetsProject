package com.skilldistillery.entities;

public abstract class CargoPlane extends Jet implements CargoCarrier {
	public CargoPlane() {
		
	}
	public CargoPlane(String name, double speed, int range, long price) {
		super();
	//	loadCargo(); (?)
	}
	
	abstract void loadCargo();
}
