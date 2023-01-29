package com.skilldistillery.entities;

public class Cesna extends Jet {
	
	
	public Cesna() {
		
	}
	
	public Cesna(String model, double speed, int range, long price) {
		super(model,speed, range, price);
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("The Cesna takes a joyride up and down the coast for scenic views.");
	}
	
}
