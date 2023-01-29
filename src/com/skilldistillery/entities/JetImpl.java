package com.skilldistillery.entities;

import java.text.DecimalFormat;

public class JetImpl extends Jet {
	public JetImpl() {
		
	}
	
	public JetImpl(String name, double speed, int range, long price) {
		super(name,speed,range,price);
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println(this.getModel() + " takes a generic, user generated flight for a maximum of " +df.format(this.getRange()/this.getSpeed()) + " hours.");
	}

}
