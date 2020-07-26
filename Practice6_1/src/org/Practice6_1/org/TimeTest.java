package org.Practice6_1.org;

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
 		
 		System.out.println("method3. set time\n\n");
 		
 		System.out.println("true case information: 23hour 59minute\n");
 		time1.setTime(23, 59);
 		
 		System.out.println("false case information: 25hour 00minute\n");
 		time1.setTime(25, 00);
 		System.out.println("----------------\n\n");
 		
 		System.out.println("method4. setTime2\n\n");
 		System.out.println("information: 11hour 30minute isPM true\n");
 		time1.setTime(11, 30,true);
 		
 		System.out.println("\ninformation: 13hour 30minute isPM true\n");
 		time1.setTime(13, 30,true);

	}

}
