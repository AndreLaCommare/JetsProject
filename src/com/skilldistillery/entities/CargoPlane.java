package com.skilldistillery.entities;

import java.text.DecimalFormat;

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
		System.out.println("I am " + this.getModel() + " carrier and I load cargo for express international shipping.");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("A " + this.getModel() + " rumbles across the sky slowly. For a maximum of " + df.format(this.getRange()/this.getSpeed())  + " hours.");
	}

}
