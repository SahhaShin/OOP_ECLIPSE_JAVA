package org.Practice4_2_1.eclipse;

public class MotorBoat {
	
	//연료양, 속도 체크 후 에러 메세지 프라이빗변수들은 게터와 세터메소드
	public static final double fuelCap=60.0;
	public static final double maxSpeed=30.0;
	
	double Time;
    double fuelBurned;
	
    //게터세터생성해야함
    private double fuelAmount;
    private double curSpeed;
    private double efficiency;
    
    
    double distance;
    
    //게터세터 생성
    public double getFuelAmount() {
    	System.out.println("fuelAmount Getting...");
    	
		return fuelAmount;
	}

	public void setFuelAmount(double fuelAmount) {
		if(fuelAmount > 0.0){
            if(fuelAmount > fuelCap) {
            	
            	System.out.println("Error: fuel capacity over(0~60)!!!");
            	System.out.println("Error: Setting Fuel Maximum 60...");
            	System.out.println("----------------------------------\n");
                fuelAmount = fuelCap;
            }
            else {
                System.out.println("fuelAmount Setting...");
                System.out.println("----------------------------------\n");
        		this.fuelAmount = fuelAmount; 
            }
		}
		else{
        	System.out.println("Error: Please Enter fuelAmount more than 0(0~60)!!!");
        	System.out.println("----------------------------------\n");
        }
	}

	public double getCurSpeed() {
		System.out.println("currentSpeed Getting...");
		
		return curSpeed;
	}

	public void setCurSpeed(double curSpeed) {
		if(curSpeed>0) {
			if(curSpeed > maxSpeed) {
				System.out.println("Error: current Speed over Max Speed(0~30)!!!");
            	System.out.println("Error: Setting current Speed Maximum 30...");
            	System.out.println("----------------------------------\n");
            	this.curSpeed = maxSpeed;
				
			}
			
			else {
				System.out.println("currentSpeed Setting...");
				System.out.println("----------------------------------\n");
				this.curSpeed = curSpeed;
			}
		}
		else {
			System.out.println("Error: Please Enter curSpeed more than 0(0~30)!!!");
        	System.out.println("----------------------------------\n");
		}
	}

	public double getEfficiency() {
		System.out.println("Efficiency Getting...");
		return efficiency;
	}

	public void setEfficiency(double efficiency) {
		System.out.println("Efficiency Setting...");
		System.out.println("----------------------------------\n");
		this.efficiency = efficiency;
	}

    
    public void changeSpeed(double newSpeed)
    {
        if(newSpeed < 0.0) {
        	System.out.println("Error: speed is under than 0!!!");
        	curSpeed = 0.0;
        }
        else if (newSpeed > maxSpeed) {
        	System.out.println("Error: speed is over maxSpeed!!!");
        	curSpeed = maxSpeed;
        }
        else
        curSpeed = newSpeed;
    }
    
    
    
    

    
    public void AmountOfFuel(double newTime)
    {
    	if (newTime > 0.0){
    		Time=newTime;
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
    	else {
    		System.out.println("Please Enter time is more than 0!!!");
    	}
            
    }
    
    public void Distance_st(){
    	System.out.println("\n***************");
    	System.out.println("Information\n");
    	System.out.println("current Speed: "+curSpeed);
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
