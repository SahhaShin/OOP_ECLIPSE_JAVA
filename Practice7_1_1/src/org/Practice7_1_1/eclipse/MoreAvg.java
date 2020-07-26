package org.Practice7_1_1.eclipse;
import java.util.Scanner;

public class MoreAvg {

	public static void main(String[] args) {
		
		int total=0;
		double avg=0.0;
		int num=0;
		System.out.print("Please Enter number of score: ");
		Scanner keyboard=new Scanner(System.in);
		num=keyboard.nextInt();
		
		int[] scores=new int[num];
		//initializing
		for(int i=0; i<num;i++)scores[i]=0;
		
		for(int i=0; i<num; i++) {
			System.out.print("Please Enter score: ");
			
			scores[i]=keyboard.nextInt();
			
			total=total+scores[i];
		}
		
		avg=(float)total/num;
		System.out.println("----------------------");
		System.out.println("average is "+avg+"\n");
		
		System.out.println("Above the average");
		for(int i=0; i<num; i++) {
			if(avg<scores[i]) {
				System.out.println("> "+scores[i]);
			}
				
		}

	}

}
