package com.homework.assignment3;

public class Manufacture {
	
	private String manufacturerName;
	private String manufacturerCountry;
	
	public Manufacture(String manufacturerName, String manufacturerCountry) {
		this.manufacturerName = manufacturerName;
		this.manufacturerCountry = manufacturerCountry;
	}
	
	public String getManufacturerName() {
		return manufacturerName;
	}
	
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	
	public String getManufacturerCountry() {
		return manufacturerCountry;
	}
	
	public void setManufacturerCountry(String manufacturerCountry) {
		this.manufacturerCountry = manufacturerCountry;
	}

}
