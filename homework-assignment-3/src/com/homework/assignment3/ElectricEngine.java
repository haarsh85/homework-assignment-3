package com.homework.assignment3;

public class ElectricEngine extends Engine{
	
	private double batteryCapacity;
	
	public ElectricEngine(String engineType, int horsepower, double batteryCapacity) {
		super(engineType, horsepower);
		this.batteryCapacity = batteryCapacity;
	}
	
	@Override
	public double getBatteryCapacity() {
		return batteryCapacity;
	}

}
