package com.homework.assignment3;

//class HybridV is a subclass of Vehicle
public class HybridV extends Vehicle{
	
	public HybridV(Manufacture manufacture, Engine engine) {
		super(manufacture, engine);
	}
	
	//Override the showCharacteristics method from Vehicle class.

	@Override
	public void showCharacteristics() {
		System.out.println("Vehicle Type: HybridV");
		System.out.println("Manufacturer Name: " + getManufacture().getManufacturerName());
		System.out.println("Manufacturer Country: " + getManufacture().getManufacturerCountry());
		System.out.println("Engine Type: " + getEngine().getEngineType());
		System.out.println("Horsepower: " + getEngine().getHorsepower());
		System.out.println("Fuel Type: " + getEngine().getFuelType());
		System.out.println("Battery Capacity: " + getEngine().getBatteryCapacity());
	}

}
