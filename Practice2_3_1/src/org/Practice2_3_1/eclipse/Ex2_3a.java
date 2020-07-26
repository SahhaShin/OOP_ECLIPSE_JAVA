package org.Practice2_3_1.eclipse;

import java.util.Scanner;

public class Ex2_3a {

	public static void main(String[] args) {
		System.out.println("You paid $ 1. How much is the value of things?");
		System.out.println("Enter between 25 and 100 cents in 5 cent increments: ");
		
		int paid=0;
		
		Scanner keyboard=new Scanner(System.in);
		paid=keyboard.nextInt();
		
		while(paid<25 || paid%5!=0) {
			System.out.println("Enter between 25 and 100 cents in 5 cent increments: ");
			paid=keyboard.nextInt();
		}
		
		if(paid>100) {
			System.out.println("You cannot buy things.");
		}
		
		
		//25~100사이일때
		else {
			int change;
			int quarters=0;
			int dimes=0;
			int nickels=0;
			
			change=100-paid;
			//25센트
			if(change>=25) {
				quarters=change/25;
				change=change%25;
			}
			//10센트
			if(change>=10) {
				dimes=change/10;
				change=change%10;
			}
			//5센트
			if(change>=5) {
				nickels=change/5;
				change=change%5;
			}
			
			System.out.println("for an item of "+paid+"cents, the change is "+(100-paid)+"cents, which is given by "+quarters+ "quarters, "+dimes+"dimes, and "+nickels+ "nickels");
	
		}

	}

}
