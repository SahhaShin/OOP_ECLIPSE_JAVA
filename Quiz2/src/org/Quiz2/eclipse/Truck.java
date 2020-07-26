package org.Quiz2.eclipse;


public class Truck extends Vehicle implements java.lang.Comparable{
	
	public final double load_cap;
	public final double towingCapacity;//in tons
	private double cur_load;//<=load cap in tons
	
	//name cyl추가 안하면 안만들어짐
	public Truck(String name, int cyl,double load, double towingCap) {
		super(name, cyl);
		load_cap=load;
		towingCapacity=towingCap;
	}
	
	
	//setter method
	public void setCur_load(double cur_load) {
		if(load_cap>=cur_load&&cur_load>=0) {
			this.cur_load=cur_load;
		}
		else {
			System.out.println("Error Enter more than 0 or lower than load_cap");
		}
		
	}
	public double getCur_load() {
		return cur_load;
	}
	
	public boolean equals(Truck otherTruck) {
		return super.equals(otherTruck)&&
		this.load_cap==otherTruck.load_cap&&
		this.towingCapacity==otherTruck.towingCapacity&&this.cur_load==otherTruck.cur_load;
	}
	
	public int compareTo(Object object) {
		
		if((object!=null)&&(object instanceof Truck)) {
			Truck truck=(Truck)object;
			
			if(load_cap>truck.load_cap)
				return 1;
			else if(load_cap<truck.load_cap)
				return -1;
			else return 0;
		}
		return -1;
	}
	
	public void writeOutput() {
		System.out.println("\n----------------Truck information---------------------\n");
		System.out.println("manu_name: "+manu_name+" ");
		System.out.println(" numOfCyl: "+numOfCyl+" ");
		//System.out.println("owner: "+owner.name);//사용불가 private이기 때문
		System.out.println(" Load Capacity: "+load_cap+" ");
		System.out.println(" Towing Capacity: "+towingCapacity+" ");
		System.out.println(" Load Capacity: "+cur_load+" ");
		System.out.println("------------------------------------------------------\n");
		
		
	}
	
	

}
