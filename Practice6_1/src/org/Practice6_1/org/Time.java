package org.Practice6_1.org;

public class Time {
	
	private int hour;//0~23
    private int minute;//0~59
     
    //생성자(constructor)는 0으로 초기화를 한다.->retrun 값이 항상 없다.
     public Time(){
        hour = 0;
        minute = 0;
     }
      
     public static boolean isValid(int hour, int minute)
     {
        if((hour >= 0 && hour <= 23) && (minute >= 0 && minute <=59))
        {
        	System.out.println("-> is Valid\n\n");
            return true;
        }
        else
        {
        	System.out.println("-> is not Valid\n\n");
            return false;
        }
     }
      
     public void setTime(int hour,int minute)
     {
    	 
        if(isValid(hour, minute))
        {
        	this.hour=hour;
        	this.minute=minute;
        	System.out.println("Valid so, set time o\n\n");
        }
        else {
        	System.out.println("Not valid so, set time x\n\n");
        }
     }
      
     public void setTime(int hour,int minute,boolean isPM)
     {
    	
        if(isValid(hour,minute))
        {
        	if(hour>=0&&hour<=12) {
        		if(isPM) {
        		
        			System.out.println("isPM true!!\n");
            		hour=hour+12;
            		if(hour==24) {
            			hour=0;
            		}
            		setTime(hour,minute);
            		System.out.println("isPM result : "+hour+"hour "+minute+"minute\n");
        		}
        		else {
        			System.out.println("isPM false!!\n");
        		
        		}
         
        		
        	}
        	else {
            	System.out.println("hour is not 0~12\n");
            }
        	
        	
        }
        
      
     }

}
