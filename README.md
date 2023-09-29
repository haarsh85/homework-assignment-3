# Homework Assignment 3
Matriculation Number: 7218924 <br />
GitHub Link: https://github.com/haarsh85/homework-assignment-3.git

# Development Environment:
- java 20.0.2 2023-07-18
Java(TM) SE Runtime Environment (build 20.0.2+9-78)
Java HotSpot(TM) 64-Bit Server VM (build 20.0.2+9-78, mixed mode, sharing)

-	IDE
Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
Version: 2023-06 (4.28.0)

# Solution Description
This project contains 10 java files. The use and contents are described briefly below.
- `Engine.java`
  - This is a super class which will be used to create 03 sub classes later namely `CombustionEngine`, `ElectricEngine` and `HybridEngine`.
  - This class has 02 common variables called `engineType` and `horsepower`, a constructor and getter methods (`getEngineType()`, `getHorsepower()`).
  - It also has getter methods for `fuelType` and `batteryCapacity` for later use within it's sub classes.
 
- `CombustionEngine.java`
  - This is a sub class of `Engine` super class.
  - It has an additional specific variable `fuelType` which value will be set inside the constructor.
  - It overrides `getFuelType()` method declared in Engine class, which will return assigned fuel type.
 
- `ElectricEngine.java`
  - This is a sub class of `Engine` super class.
  - It has an additional specific variable `batteryCapacity` which value will be set inside the constructor.
  - It overrides `getBatteryCapacity()` method declared in Engine class, which will return assigned battery capacity.
 
- `HybridEngine.java`
  - This is a sub class of `Engine` super class.
  - It has an additional specific variables `fuelType` and `batteryCapacity` which value will be set inside the constructor.
  - It overrides both `getFuelType` and `getBatteryCapacity()` methods declared in Engine class, which will return assigned fuel type and battery capacity.
 
- `Manufacture.java`
  - This class has manufacture name and country.
  - Also, getters and setters are declared to get and set values for manufacture name and country.
 
- `Vehicle.java`
  - This is a super class which will be used to create 03 sub classes namely `ICEV`, `BEV` and `HybridV`.
  - This class is abstract because it has an abstract method `showCharacteristics()`.
  - Also, this class has variables which holds attributes from Manufacture and Engine classes types. So, each subclass of class Vehicle should have these attributes.

- `ICEV.java`
  - This is a sub class of `Vehicle` super class.
  - In this class, the method `showCharacteristics()` has been implemented to print Manufacture, Engine and Fuel type details applicable to ICEV objects.
 
- `BEV.java`
  - This is a sub class of `Vehicle` super class.
  - In this class, the method `showCharacteristics()` has been implemented to print Manufacture, Engine and Battery capacity details applicable to BEV objects.
 
- `HybridV.java`
  - This is a sub class of `Vehicle` super class.
  - In this class, the method `showCharacteristics()` has been implemented to print Manufacture, Engine, Fuel type and Battery capacity details applicable to HybridV objects.
 
- `ResultDemo.java`
  - This class has the main method, which is used to run the code.
  - Created 03 instances of Manufacture class
  ```
    Manufacture toyota = new Manufacture("Toyota", "Japan");
	Manufacture tesla = new Manufacture("Tesla", "USA");
	Manufacture bmw = new Manufacture("BMW", "Germany");
    ```
  - Created 03 instances of Engine sub classes
  ```
    Engine icevEngine = new CombustionEngine("Gasoline", 200, "Petrol");
	Engine bevEngine = new ElectricEngine("Electric", 150, 80.75);
	Engine hybridVEngine = new HybridEngine("Hybrid", 180, "Diesel", 60.12);
  ```
  - Created 03 instances of Vehicle sub classes
  ```
    Vehicle icev = new ICEV(toyota, icevEngine);
	Vehicle bev = new BEV(tesla, bevEngine);
	Vehicle hybridV = new HybridV(bmw, hybridVEngine);
  ```
  - Created an array of Vehicle which contains objects of ICEV, BEV, HybridV
  ```
    Vehicle[] vehicles = {icev, bev, hybridV};
  ```
  - Used method showCharacteristics() to demonstrate result
  ```
    for (Vehicle v : vehicles) {
	v.showCharacteristics();
	System.out.println();
   }
  ```

  # Output
  Below is the resulted output generated when code is run.
  ```
  Vehicle Type: ICEV
  Manufacturer Name: Toyota
  Manufacturer Country: Japan
  Engine Type: Gasoline
  Horsepower: 200
  Fuel Type: Petrol

  Vehicle Type: BEV
  Manufacturer Name: Tesla
  Manufacturer Country: USA
  Engine Type: Electric
  Horsepower: 150
  Battery Capacity: 80.75

  Vehicle Type: HybridV
  Manufacturer Name: BMW
  Manufacturer Country: Germany
  Engine Type: Hybrid
  Horsepower: 180
  Fuel Type: Diesel
  Battery Capacity: 60.12
  ```
