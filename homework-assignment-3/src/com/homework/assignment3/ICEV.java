package com.homework.assignment3;

//class ICEV is a subclass of Vehicle
public class ICEV extends Vehicle{
		
	public ICEV(Manufacture manufacture, Engine engine) {
		super(manufacture, engine);
	}
	
	//Override the showCharacteristics method from Vehicle class.
	
	@Override
	public void showCharacteristics() {
		System.out.println("Vehicle Type: ICEV");
		System.out.println("Manufacturer Name: " + getManufacture().getManufacturerName());
		System.out.println("Manufacturer Country: " + getManufacture().getManufacturerCountry());
		System.out.println("Engine Type: " + getEngine().getEngineType());
		System.out.println("Horsepower: " + getEngine().getHorsepower());
		System.out.println("Fuel Type: " + getEngine().getFuelType());
	}
	

}
