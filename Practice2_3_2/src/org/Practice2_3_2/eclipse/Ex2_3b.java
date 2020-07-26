package org.Practice2_3_2.eclipse;

import java.util.Scanner;

public class Ex2_3b {

	public static void main(String[] args) {
		System.out.print("Please enter a radius(in inches): ");
		Scanner keyboard=new Scanner(System.in);
		
		double radius;
		radius=keyboard.nextDouble();
		

		System.out.print("Please enter a depth(in feet): ");
		double depth;
		depth=keyboard.nextDouble();
		
		double volume;
		
		volume=(3.14*((1/12.0)*radius)*((1/12.0)*radius)*depth)*7.48;//gallons·Î º¯È¯

		System.out.print("a "+depth+"-foot well with a radius of "+radius+"inches holds about "+volume+"gallons of water");
		


	}

}
