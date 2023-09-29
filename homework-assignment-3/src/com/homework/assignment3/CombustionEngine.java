package com.homework.assignment3;

public class CombustionEngine extends Engine{
	
	private String fuelType;
	
	public CombustionEngine(String engineType, int horsepower, String fuelType) {
		super(engineType, horsepower);
		this.fuelType = fuelType;

	}
	
	@Override
	public String getFuelType() {
		return fuelType;
		
	}

}
