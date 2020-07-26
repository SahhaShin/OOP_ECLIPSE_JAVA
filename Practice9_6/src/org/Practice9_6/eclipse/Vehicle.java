package org.Practice9_6.eclipse;

public class Vehicle extends Person {
	
	private String manufacturersName;
	private int numberOfCylinders;
	private Person owner;
	
	public Vehicle(Person person,String name,int cylinder) {
		owner=person;
		manufacturersName=name;
		numberOfCylinders=cylinder;
	}
	
	//setter method
	public void setManufacturersName(String name) {
		manufacturersName=name;
	}
	
	public void setOwner(Person newOwner) {
		owner=newOwner;
	}
	public void setNumberOfCylinders(int cylinder) {
		numberOfCylinders=cylinder;
	}
	
	//getter method
	
	public Person getOwner() {
		return owner;
	}
	
	public String getManufacturersName() {
		return manufacturersName;
	}
	
	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}
	
	public void writeOutput() {
		System.out.println("Owner: "+owner.getName());
		System.out.println("Manufacturer: "+getManufacturersName());
		System.out.println("number Of Cylinders: "+getNumberOfCylinders());
		
	}
	
	public boolean equals(Vehicle otherVehicle) {
		return this.owner.hasSameName(otherVehicle.getOwner())&&
				this.manufacturersName.equalsIgnoreCase(otherVehicle.manufacturersName)&&
				this.numberOfCylinders==otherVehicle.numberOfCylinders;
	}
	
	
	
	
	

}
