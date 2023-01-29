package com.skilldistillery.entities;

public class JetImpl extends Jet {
	public JetImpl() {
		
	}
	
	public JetImpl(String name, double speed, int range, long price) {
		super(name,speed,range,price);
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(this.getModel() + " takes a generic, user generated flight");
	}

}
