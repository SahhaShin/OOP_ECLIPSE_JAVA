package org.Practice9_6.eclipse;

public class Truck extends Vehicle {
	
	private double loadCapacity;//in tons
	private double towingCapacity;//in tons
	
	
	public Truck(Person owner, String name, int cylinder, double load, double towingCap) {
		super(owner,name,cylinder);
		loadCapacity=load;
		towingCapacity=towingCap;
	}
	
	
	//setter method
	public void setLoadCapacity(double load) {
		loadCapacity=load;
	}
	public void setTowingCapacity(double towing) {
		towingCapacity=towing;
	}
	
	//getter method
	public double getLoadCapacity() {
		return loadCapacity;
	}
	public double getTowingCapacity() {
		return towingCapacity;
	}
	
	
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Load Capacity: "+getLoadCapacity());
		System.out.println("Towing Capacity: "+getTowingCapacity());
		
	}
	
	public boolean equals(Truck otherTruck) {
		return super.equals(otherTruck)&&
		this.loadCapacity==otherTruck.loadCapacity&&
		this.towingCapacity==otherTruck.towingCapacity;
	}

}
