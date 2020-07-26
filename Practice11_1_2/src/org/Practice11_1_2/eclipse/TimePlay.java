package org.Practice11_1_2.eclipse;


public class TimePlay {

	public static void main(String[] args) {
		
		System.out.println(">create time1...\n");
		//InvalidTimeException time1=new InvalidTimeException();
		InvalidHourException time1=new InvalidHourException();
		System.out.println(">create time2...\n");
		InvalidMinuteException time2=new InvalidMinuteException();
		System.out.println("\n---------------case1----------------------\n");
		
		System.out.println(">checkFormat(13:59 pm)...");
		time1.checkTime("13:59 pm");
		System.out.println(">checkHour...");
		time1.checkHour("13");
		System.out.println(">cheakMinute");
		time2.checkMinute("59");
		
		System.out.println("\n----------------case2---------------------\n");
		System.out.println(">checkFormat(11:40 am)...");
		time1.checkTime("11:40 am");
		System.out.println(">checkHour...");
		time1.checkHour("11");
		System.out.println(">cheakMinute");
		time2.checkMinute("40");
		
		System.out.println("\n-----------------case3--------------------\n");
		System.out.println(">checkFormat(11:60)...");
		time1.checkTime("11:60");
		System.out.println(">checkHour...");
		time1.checkHour("11");
		System.out.println(">cheakMinute");
		time2.checkMinute("60");

	}

}
