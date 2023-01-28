package com.skilldistillery.entities;

public abstract class FighterJet extends Jet implements CombatReady{
	FighterJet(){
		
	}
	FighterJet(String name, double speed, int range, long price){
		super();
		//fight(); (?)
	}
	public abstract void fight();
}
