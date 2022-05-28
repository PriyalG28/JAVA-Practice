package inheritance_temp;

import module1.Vehicle;

public class Truck extends Vehicle {
	int maxLoadingCapacity;
	
	public void print() {
		System.out.println("Vehicle color " + getColor() + " max speed " + maxSpeed + " maxLoadingCapacity "+ maxLoadingCapacity );
	}

}
