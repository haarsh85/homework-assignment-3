package com.homework.assignment3;

public class Engine {
	
	private String engineType;
	private int horsepower;
	
	public Engine (String engineType, int horsepower) {
		this.engineType = engineType;
		this.horsepower = horsepower;

	}
	
	public String getEngineType() {
		return engineType;
	}
	
	public int getHorsepower() {
		return horsepower;
	}
	
	public String getFuelType() {
		return null;
	}
	
	public double getBatteryCapacity() {
		return 0.0;
	}

}
