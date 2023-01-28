package com.skilldistillery.entities;

public class CargoPlane extends Jet implements CargoCarrier {
	public CargoPlane() {

	}

	public CargoPlane(String model, double speed, int range, long price) {
		super();
		// loadCargo(); (?)
	}

	@Override
	public void loadCargo() {
		// TODO Auto-generated method stub
		System.out.println("I am cargo carrier and i load");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("A Cargo Plane rumbles across the sky slowly");
	}

}
