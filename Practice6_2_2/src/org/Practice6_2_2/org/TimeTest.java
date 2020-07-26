package org.Practice6_2_2.org;


public class TimeTest {

	public static void main(String[] args) {
		System.out.println("System Start!!!\n");
    	System.out.println("----------------\n\n");
 		
 		System.out.println("method1. Create new time and initialize hour and minute.\n\n");
 		
 		Time time1=new Time();
 		System.out.println("----------------\n\n");
 		
 		System.out.println("method2. isValid(0<=hour<=23 , 0<=minute<=59)\n\n");
 		System.out.println("true case information: 23hour 59minute\n");
 		time1.isValid(23, 59);
 		
 		
 		System.out.println("false case information: 25hour 00minute\n");
 		time1.isValid(25, 00);
 		
 		
 		System.out.println("----------------\n\n");
 		
 		System.out.println("method3. set time -> constructor Time\n\n");
 		
 		System.out.println("true case information: 23hour 59minute\n");
 		time1.Time(23, 59);
 		
 		System.out.println("false case information: 25hour 00minute\n");
 		time1.Time(25, 00);
 		System.out.println("----------------\n\n");
 		
 		System.out.println("method4. setTime2 -> constructor Time\n\n");
 		System.out.println("information: 11hour 30minute isPM true\n");
 		time1.Time(11, 30,true);
 		
 		System.out.println("\ninformation: 13hour 30minute isPM true\n");
 		time1.Time(13, 30,true);
 		System.out.println("----------------\n\n");
 		
 		System.out.println("new method1. getTime24\n\n");
 		System.out.println("\ninformation: 13hour 30minute\n");
 		String time24=time1.getTime24(13, 30);
 		System.out.println("-> "+time24);
 		System.out.println("----------------\n\n");
 		
 		System.out.println("new method2. getTime12\n\n");
 		System.out.println("\ninformation: 13hour 30minute\n");
 		String time12=time1.getTime12(13, 30);
 		System.out.println("-> "+time12);
 		
 		System.out.println("\n\ninformation: 1hour 30minute\n");
 		time12=time1.getTime12(1, 30);
 		System.out.println("-> "+time12);

	}

}
