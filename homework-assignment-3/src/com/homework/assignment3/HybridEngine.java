package com.homework.assignment3;

public class HybridEngine extends Engine{
	
	private String fuelType;
	private double batteryCapacity;
	
	public HybridEngine(String engineType, int horsepower, String fuelType, double batteryCapacity) {
		super(engineType, horsepower);
		this.fuelType = fuelType;
		this.batteryCapacity = batteryCapacity;
	}
	
	@Override
	public String getFuelType() {
		return fuelType;
	}
	
	@Override
	public double getBatteryCapacity() {
		return batteryCapacity;
	}

}
