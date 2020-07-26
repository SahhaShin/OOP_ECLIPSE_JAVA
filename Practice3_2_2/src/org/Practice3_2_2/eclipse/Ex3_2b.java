package org.Practice3_2_2.eclipse;

import java.util.Scanner;

public class Ex3_2b {

	public static void main(String[] args) {
		int number=0;
		int A=0;
		int B=0;
		int C=0;
		int D=0;
		int F=0;
		int count=0; 
	
	
		Scanner keyboard=new Scanner(System.in);
	
		while(number>=0) {
			System.out.print("Enter an integer between 0 and 100. (end:negative integers): ");
			number=keyboard.nextInt();
			
			if(number>100) {
				System.out.println("Not include");
				continue;
			}
			
			else if(number<=100&&number>=90) {
				A++;
			}
		
			else if(number<90&&number>=80) {
				B++;
			}
		
			else if(number<80&&number>=70) {
				C++;
			}
			else if(number<70&&number>=60) {
				D++;
			}
			else if(number<60&&number>=0) {
				F++;
			}
			else if(number<0) {
				System.out.println("END");
				break;
			}

			count++;
		
		}

		
		System.out.println("Total count = "+count);
		System.out.println("A = "+A+", B = "+B+", C = "+C+", D = "+D+", F = "+F);

	}

}
