package org.Quiz2.eclipse;

public abstract class Vehicle {
	public final String manu_name;
	public final int numOfCyl;
	private Person owner;
	
	
	public Vehicle(String name, int cyl) {
		manu_name=name;
		numOfCyl=cyl;
	}
	
	
	public void setOwner(Person newOwner) {
		owner=newOwner;
	}
	public Person getOwner() {
		return owner;
	}
	
	public boolean equals(Vehicle otherVehicle) {
        
        return this.manu_name.equalsIgnoreCase(otherVehicle.manu_name) &&
            (this.numOfCyl == otherVehicle.numOfCyl);
    }
	
	public String toString() {
		return "manu_name : "+manu_name+"numOfCyl : "+numOfCyl+"owner : "+getOwner();
	}
	
	public abstract int compareTo(Object obj);



}
