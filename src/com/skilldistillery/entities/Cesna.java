package com.skilldistillery.entities;

import java.text.DecimalFormat;

public class Cesna extends Jet {
	
	
	public Cesna() {
		
	}
	
	public Cesna(String model, double speed, int range, long price) {
		super(model,speed, range, price);
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("The " + this.getModel() + " takes a joyride up and down the coast for scenic views."
				+ " It has a max flight time of " + df.format(this.getRange()/this.getSpeed()) + " hours.");
	}
	
}
