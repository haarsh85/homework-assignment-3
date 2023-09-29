package com.homework.assignment3;

public abstract class Vehicle {
	
	/*Following variables hold objects of the Manufacture and Engine classes.
	 * So, each subclass of class Vehicle have attributes of class Manufacture and Engine.
	 */
	private Manufacture manufacture;
	private Engine engine;
	
	public Vehicle(Manufacture manufacture, Engine engine) {
		this.manufacture = manufacture;
		this.engine = engine;
	}
	
	public Manufacture getManufacture() {
		return manufacture;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	//Abstract method
	public abstract void showCharacteristics();
	
}
