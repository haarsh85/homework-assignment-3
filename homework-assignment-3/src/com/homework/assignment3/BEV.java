package com.homework.assignment3;

//class BEV is a subclass of Vehicle
public class BEV extends Vehicle{
	
	public BEV(Manufacture manufacture, Engine engine) {
		super(manufacture, engine);
	}
	
	//Override the showCharacteristics method from Vehicle class.
	
	@Override
	public void showCharacteristics() {
		System.out.println("Vehicle Type: BEV");
		System.out.println("Manufacturer Name: " + getManufacture().getManufacturerName());
		System.out.println("Manufacturer Country: " + getManufacture().getManufacturerCountry());
		System.out.println("Engine Type: " + getEngine().getEngineType());
		System.out.println("Horsepower: " + getEngine().getHorsepower());
		System.out.println("Battery Capacity: " + getEngine().getBatteryCapacity());
	}

}
