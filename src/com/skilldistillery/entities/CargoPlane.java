package com.skilldistillery.entities;

public class CargoPlane extends Jet implements CargoCarrier {
	public CargoPlane() {

	}

	public CargoPlane(String model, double speed, int range, long price) {
		super(model,speed, range, price);
		// loadCargo(); (?)
	}

	@Override
	public void loadCargo() {
		// TODO Auto-generated method stub
		System.out.println("I am " + this.getModel() + " carrier and I load.");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("A " + this.getModel() + " rumbles across the sky slowly." );
	}

}
