package org.Practice11_1_1.eclipse;

public class TimePlay {

	public static void main(String[] args) {
		System.out.println(">create time1, check format(13:59 pm)...\n");
		InvalidTimeException time1=new InvalidTimeException();
		time1.checkTime("13:59 pm");
		
		
		System.out.println("\n-------------------------------------\n");
		
		System.out.println("\n>create time2, check format(11:40 am)...\n");
		InvalidTimeException time2=new InvalidTimeException();
		time2.checkTime("11:40 am");
		
		System.out.println("\n-------------------------------------\n");
		
		System.out.println("\n>create time3, check format(11:40)...\n");
		InvalidTimeException time3=new InvalidTimeException();
		time3.checkTime("11:40");
		
				
		
		
	}

}
