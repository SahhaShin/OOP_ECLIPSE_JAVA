package org.Practice3_2_1.eclipse;

import java.util.Scanner;

public class Ex3_2a {

	public static void main(String[] args) {
		
		int number=0;
		double aver=0;
		int min=100;
		int max=0;
		int total=0;
		int count=0; 
	
	
		Scanner keyboard=new Scanner(System.in);
	
		while(number>=0) {
			System.out.print("Please Enter non-negative integers (end:negative integers): ");
			number=keyboard.nextInt();
			
			if(number<0) {
				break;
			}
		
			if(number<min) {
				min=number;
			}
		
			if(number>max) {
				max=number;
			}
			total+=number;
			count++;
		
		}
		aver=(double)total/count;
		
		System.out.println("min = "+min+", max = "+max+", average = "+aver);
	}

}
