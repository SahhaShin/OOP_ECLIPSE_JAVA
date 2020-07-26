package org.Practice4_2_1.eclipse;


public class MotorBoatDemo {

	public static void main(String[] args) {
		MotorBoat boat1 = new MotorBoat();//(50.0, 20.0, 30.0, 15.0, 0.1, 5.0);
        
		System.out.println("*************Start Setting*************");
		System.out.println("-fuel ERROR case1: more than Max");
		boat1.setFuelAmount(70.0);
		
		System.out.println("-fuel ERROR case2: lower than 0");
		boat1.setFuelAmount(-10.0);
		
		System.out.println("-fuel NOMAL case");
		boat1.setFuelAmount(20.0);
		System.out.println("\n");
		
		System.out.println("-current speed ERROR case1: more than Max");
		boat1.setCurSpeed(40.0);
		System.out.println("-current speed ERROR case2: lower than 0");
		boat1.setCurSpeed(-15.0);
		System.out.println("-current speed NOMAL case");
		boat1.setCurSpeed(15.0);
		
		boat1.setEfficiency(0.1);
		System.out.println("***************End Setting*************\n");
		
		System.out.println("\n\n");
		System.out.println("*************Start Getting*************");
		double fuel=boat1.getFuelAmount();
		double curspeed=boat1.getCurSpeed();
		double efficiency=boat1.getEfficiency();
		
		System.out.println("***************END Getting*************");
		
		System.out.println("----------------");
        System.out.println("\nmethod1:");
        
        System.out.println("CASE1: TIME > 0");
        boat1.AmountOfFuel(1.0);
        
        System.out.println("\n\n");
        System.out.println("CASE2: TIME < 0");
        boat1.AmountOfFuel(-1.0);
        
        System.out.println("\n\n");
        
        
        
        System.out.println("----------------");
        System.out.println("\nmethod2:");
        boat1.Distance_st();
        System.out.println("\n\n");
        
        System.out.println("----------------");
        System.out.println("\nmethod3:");
        boat1.Distance_sf();
        
        
        
        
        
	}

}
