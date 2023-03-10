package com.skilldistillery.entities;

import java.text.DecimalFormat;
import java.util.Objects;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private long price;
	
	public abstract void fly();
	

	public Jet() {
		
	}
	
	public Jet(String model, double speed,int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jet " + (model != null ? "model: " + model + ", " : "") + "speed: " + speed + ", range: " + range
				+ ", price: " + price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(model, price, range, speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jet other = (Jet) obj;
		return Objects.equals(model, other.model) && price == other.price && range == other.range
				&& Double.doubleToLongBits(speed) == Double.doubleToLongBits(other.speed);
	}
	
	
	
	public double getSpeedInMach() {
		double answer = 0;
		return answer;
	}
	
	public void listJetDetails() {
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("jet model: " + getModel() );
		
		System.out.println("jet speed in mph: " + getSpeed() );
		System.out.println("jet speed in Mach: " + df.format(getSpeed()/761.2) );
		System.out.println("jet range in miles: " + getRange() );
		System.out.println("jet price in USD: " + getPrice() );
		System.out.println();
		
	}
	
	
	
}
