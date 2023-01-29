package com.skilldistillery.entities;

import java.text.DecimalFormat;

public class FighterJet extends Jet implements CombatReady {
	FighterJet() {
		super();

	}

	FighterJet(String model, double speed, int range, long price) {
		super(model,speed, range, price);

	}

	@Override
	public void fight() {
		System.out.println("An " + this.getModel() + " engages its target and its guns go BBRRRRRRRRRRRRRRRTTTTTTTT!!!!!!!");
	}

	@Override
	public void fly() {
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("An " + this.getModel() + " sours swiftly through the clouds and tears holes through the sound barrier. It maintains this directive for a maximum of " + df.format(this.getRange()/this.getSpeed()) + " hours.");
	}
	
//	@Override
//	public void listJetDetails() {
//		System.out.println("jet class: FighterJet");
//		super.listJetDetails();
//		
//	}

}
