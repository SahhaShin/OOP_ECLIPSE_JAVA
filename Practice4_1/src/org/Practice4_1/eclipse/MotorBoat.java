package org.Practice4_1.eclipse;

public class MotorBoat {
	double capacityOfFuelTank;
    double fuelAmount;
    double maxSpeed;
    double curSpeed;
    double efficiency;
    double distance;//boat
    double Time;
    double fuelBurned;
   
   
   
    public void initialize(double fuelCapacity, double fuelAmounta, double maxSpeeda, double currentSpeed, double efficiencya)
    {
    	capacityOfFuelTank = fuelCapacity;
    	fuelAmount=fuelAmounta;
    	maxSpeed=maxSpeeda;
        curSpeed = currentSpeed;
        efficiency=efficiencya;
        
    }
    
    
    public void AmountOfFuel(double newOpTime)
    {
    	Time=newOpTime;
    	System.out.println("\n***************");
    	System.out.println("Information\n");
    	System.out.println("efficiency: "+efficiency);
    	System.out.println("current Speed: "+curSpeed);
    	System.out.println("Time: "+Time);
    	System.out.println("***************\n");
        fuelBurned = efficiency * curSpeed * curSpeed * Time;//현재속도
        System.out.println("The amount of fuel used at the current speeds: "+fuelBurned);
        
        System.out.println("\n***************");
    	System.out.println("Information\n");
    	System.out.println("efficiency: "+efficiency);
    	System.out.println("Maximum Speed: "+maxSpeed);
    	System.out.println("Time: "+Time);
    	System.out.println("***************\n");
        
        fuelBurned = efficiency * maxSpeed * maxSpeed * Time;//최대속도
        System.out.println("The amount of fuel used at the maximum: "+fuelBurned);
            
    }
    
    public void Distance_st(){
    	System.out.println("\n***************");
    	System.out.println("Information\n");
    	System.out.println("current Speed: "+maxSpeed);
    	System.out.println("Time: "+Time);
    	System.out.println("***************\n");
    	distance=curSpeed*Time;
    	System.out.println("the travel distance: "+distance);
    }
    
    public void Distance_sf(){
    	System.out.println("\n***************");
    	System.out.println("Information\n");
    	System.out.println("fuelAmount: "+fuelAmount);
    	System.out.println("efficiency: "+efficiency);
    	System.out.println("current Speed: "+curSpeed);
    	System.out.println("***************\n");
    	distance=fuelAmount/(efficiency*curSpeed);
    	System.out.println("the travel distance: "+distance);
    }

}
