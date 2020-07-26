package org.Practice_2.eclipse;

import java.util.Scanner;

public class Ex1_2b {

	public static void main(String[] args) {
		
		System.out.println("Let me tell you the number of integers between two integers.");
		System.out.println("Please enter the first number less than the second number.");
		System.out.println("Enter two whole numbers on a line:");
		
		int n1,n2;
		
		Scanner keyboard = new Scanner(System.in);
		n1=keyboard.nextInt();
		n2=keyboard.nextInt();
		
		while(n1>n2) {
			System.out.println("Please enter the first number less than the second number.");
			System.out.println("Enter two whole numbers on a line:");
			n1=keyboard.nextInt();
			n2=keyboard.nextInt();
		}
		
		System.out.println("The number of integers between two integers is");
		System.out.println(n2-n1+1);
	}

}
