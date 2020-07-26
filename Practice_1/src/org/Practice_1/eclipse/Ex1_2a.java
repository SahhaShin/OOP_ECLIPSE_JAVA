package org.Practice_1.eclipse;

import java.util.Scanner;

public class Ex1_2a {

	public static void main(String[] args) {
		
		System.out.println("Please enter the year you were born:");
		
		int age_yy;
		
		Scanner keyboard = new Scanner(System.in);
		age_yy = keyboard.nextInt();
		
		if(age_yy>2020) {
			System.out.println("Yor are not born yet.");
		}
		//1998년생은 23살이다.
		else {
			System.out.println("Your age is");
			System.out.println(2020-age_yy+1);
		}
		

	}

}
