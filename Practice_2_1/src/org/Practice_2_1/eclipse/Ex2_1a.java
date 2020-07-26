package org.Practice_2_1.eclipse;

import java.util.Scanner;

public class Ex2_1a {

	public static void main(String[] args) {
		System.out.println("Please enter a four-digit number:");
		
		int num4;
		Scanner keyboard=new Scanner(System.in);
		num4=keyboard.nextInt();
		
		while(num4/1000==0||num4/1000>=10) {
			System.out.println("Please enter a four-digit integer again:");
			num4=keyboard.nextInt();
		}
		int quo;
		int decrease10=1000;
		int times=4;
		
		while(times!=0) {
			quo=num4/decrease10;
			num4=num4%decrease10;
			decrease10=decrease10/10;
			
			System.out.println(quo);
			times--;//1000일 때 고려함
		}

	}

}
