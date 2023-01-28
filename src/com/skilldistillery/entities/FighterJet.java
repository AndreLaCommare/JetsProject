package com.skilldistillery.entities;

public class FighterJet extends Jet implements CombatReady {
	FighterJet() {

	}

	FighterJet(String model, double speed, int range, long price) {
		super();

	}

	@Override
	public void fight() {
		System.out.println("A fighter jet engages its target and its guns go BBRRRRRRRRRRRRRRRTTTTTTTT!!!!!!!");
	}

	@Override
	public void fly() {
		System.out.println("A fighter jet sours swiftly through the clouds and tears holes through the sound barrier.");
	}

}
