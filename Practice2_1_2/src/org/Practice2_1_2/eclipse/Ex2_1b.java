package org.Practice2_1_2.eclipse;

import java.util.Scanner;

public class Ex2_1b {

	public static void main(String[] args) {
		System.out.println("Please enter Fahrenheit temperature:");
		
		int fah;
		double cel;
		
		Scanner keyboard=new Scanner(System.in);
		fah=keyboard.nextInt();
		
		cel=5*(fah-32)/9.0;//double형으로 9.0을 조정하여 결과값이 double로 나오게 유도
		
		System.out.println("Celsius temperature:"+cel);

	}

}
