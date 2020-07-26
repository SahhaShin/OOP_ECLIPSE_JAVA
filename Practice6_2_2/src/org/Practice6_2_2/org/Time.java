package org.Practice6_2_2.org;

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
      
     
   //setTime constructor
     public void Time(int hour,int minute)
     {
    	boolean isValid=isValid(hour, minute); 
        if(isValid)
        {
        	this.hour=hour;
        	this.minute=minute;
        	System.out.println("Valid so, set time o\n\n");
        }
        else {
        	System.out.println("Not valid so, set time x\n\n");
        }
     }
      
     
     //setTime2 constructor
     public void Time(int hour,int minute,boolean isPM)
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
             		Time(hour,minute);
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
     
     
     public static String getTime24(int hour,int minute) {
    	 String time24=String.format("%d%d",hour,minute);
    	 
    	 return time24;
     }
     
     public static String getTime12(int hour,int minute) {
    	 String time12="a";
    	 
    	 if(hour>=1&&hour<=11) {
    		 time12=String.format("%d:%d am",hour,minute);
    	 }
    	 else if(hour==12) {
    		 time12=String.format("%d:%d pm",hour,minute);
    	 }
    	 
    	 else if(hour>=13&&hour<=23) {
    		 hour=hour-12;
    		 time12=String.format("%d:%d pm",hour,minute);
    	 }
    	 
    	 else if(hour==24) {
    		 hour=hour-12;
    		 time12=String.format("%d:%d am",hour,minute);
    	 }
    	 
    	 
    	 
    	 return time12;
     }

}
