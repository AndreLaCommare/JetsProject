package com.skilldistillery.entities;

import java.text.DecimalFormat;

public class SpaceXJet extends Jet{
	
	public SpaceXJet() {
		
	}
	
	public SpaceXJet(String model, double speed, int range, long price) {
		super(model,speed, range, price);
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("\nThis is Elon's "+ this.getModel() + ", there are many like it. But this one is Elon's.\n" +
		"Elon's " + this.getModel() + " is his best friend. It is his life. He must master it as he must master his life.\n" +
		"Elon's " + this.getModel() + ", without him, is useless. Without his jet, Elon is uselss.\n");
		System.out.println("\n" + this.getModel() + "'s max flight time is " + df.format(this.getRange()/this.getSpeed()) + " hours. Before reentering Earth's lower atmosphere.\n");
	}

}
