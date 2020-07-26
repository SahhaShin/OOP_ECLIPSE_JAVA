package org.Practice4_1.eclipse;


public class MotorBoatDriver {

	public static void main(String[] args) {
		MotorBoat Boat1 = new MotorBoat();//(50.0, 20.0, 30.0, 15.0, 0.1);
        Boat1.initialize(50.0, 20.0, 30.0, 15.0, 0.1);
        
        System.out.println("----------------");
        System.out.println("\nmethod1:");
        Boat1.AmountOfFuel(1.0);
        
        System.out.println("----------------");
        System.out.println("\nmethod2:");
        Boat1.Distance_st();
        
        System.out.println("----------------");
        System.out.println("\nmethod3:");
        Boat1.Distance_sf();
	}

}
