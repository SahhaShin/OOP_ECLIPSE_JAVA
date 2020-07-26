package org.Practice7_1_2.eclipse;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		int[] frequency=new int[10];
		int terminate=1;
		String phone_num;
		
		Scanner keyboard=new Scanner(System.in);
		
		
		while(terminate==1) {
			System.out.print("Please Enter a Phone number > ");
			phone_num=keyboard.next();
			int result;
			
			for(int k=0;k<phone_num.length();k++) {
				result=(int)phone_num.charAt(k)-48;
				for(int i=0;i<10;i++) {

					if(result==i) {
						frequency[i]++;
						break;
					}
				
				}
			}
			
			System.out.println("-------------------------------------");
			System.out.println("Result");
			for(int i=0;i<10;i++) {
				System.out.println("> frequency["+i+"] : "+frequency[i]);
			}
			System.out.println("-------------------------------------");
			
			
			System.out.print("Continue(1: continue / -1: terminate)? ");
			terminate=keyboard.nextInt();
			if(terminate==-1) {
				break;
			}
			
			else {
				while(terminate!=-1 && terminate!=1) {
					System.out.print("Please Enter -1(terminate) or 1(continue): ");
					terminate=keyboard.nextInt();	
				}
				if(terminate==-1) {
					break;
				}
				else if(terminate==1) {
					for(int i=0;i<10;i++) {
						frequency[i]=0;
					}
				}
			}
		}
		
		System.out.println("End Program");

	}

}
