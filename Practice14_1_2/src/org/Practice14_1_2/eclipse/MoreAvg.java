package org.Practice14_1_2.eclipse;

import java.util.ArrayList;
import java.util.Scanner;

public class MoreAvg {

	public static void main(String[] args) {
		
		Integer total=0;
		double avg=0.0;
		int score=0;
		
		ArrayList<Integer> scores=new ArrayList<Integer>();
		
		int go=1;
		Scanner keyboard=new Scanner(System.in);
		while(go!=-1) {
			System.out.print("Please Enter score: ");
			score=keyboard.nextInt();
			if(score==-1) {
				go=-1;
				continue;
			}
			scores.add(score);
			
			total=total+score;
		}
		
		avg=(float)total/scores.size();
		System.out.println("----------------------");
		System.out.println("average is "+avg+"\n");
		
		System.out.println("Above the average");
		for(int i=0; i<scores.size(); i++) {
			if(avg<scores.get(i)) {
				System.out.println("> "+scores.get(i));
			}
				
		}

	}

}
