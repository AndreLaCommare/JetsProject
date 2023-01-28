package com.skilldistillery.entities;

public class SpaceXJet extends Jet{
	
	public SpaceXJet() {
		
	}
	
	public SpaceXJet(String model, double speed, int range, long price) {
		super();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("This is Elon's jet, there are many like it. But this one is Elon's.\n" +
		"Elon's jet is his best friend. It is his life. He must master it as he must master his life.\n" +
		"Elon's jet, without him, is useless. Without his jet, Elon is uselss.");
	}

}
