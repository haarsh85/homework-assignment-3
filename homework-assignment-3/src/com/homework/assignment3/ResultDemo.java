package com.homework.assignment3;

public class ResultDemo {

	public static void main(String[] args) {

		//Creating instances of Manufacture
		Manufacture toyota = new Manufacture("Toyota", "Japan");
		Manufacture tesla = new Manufacture("Tesla", "USA");
		Manufacture bmw = new Manufacture("BMW", "Germany");
		
		//Creating instances for each Engine Type
		Engine icevEngine = new CombustionEngine("Gasoline", 200, "Petrol");
		Engine bevEngine = new ElectricEngine("Electric", 150, 80.75);
		Engine hybridVEngine = new HybridEngine("Hybrid", 180, "Diesel", 90.12);
		
		//Creating instances of Vehicle subclasses
		Vehicle icev = new ICEV(toyota, icevEngine);
		Vehicle bev = new BEV(tesla, bevEngine);
		Vehicle hybridV = new HybridV(bmw, hybridVEngine);
		
		//Creating array of Vehicle which contains objects of ICEV, BEV and HybridV
		Vehicle[] vehicles = {icev, bev, hybridV};
		
		//Using showCharacteristics method to demonstrate result
		for (Vehicle v : vehicles) {
			v.showCharacteristics();
			System.out.println();
		}
	}
}
