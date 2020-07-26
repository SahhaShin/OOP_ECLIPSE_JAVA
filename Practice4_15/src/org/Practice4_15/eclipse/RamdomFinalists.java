package org.Practice4_15.eclipse;

public class RamdomFinalists {

	public static void main(String[] args) {
		
		System.out.println("Program start...\n");
		int num[]=new int[3];
		
		//random number
		num[0]=(int)(Math.random()*10)+1;
		num[1]=(int)(Math.random()*10)+1;
		num[2]=(int)(Math.random()*10)+1;
		
		//compare
		while((num[0]==num[1])||(num[0]==num[2])||(num[1]==num[2])) {
			
			if(num[0]==num[1]) {
				num[1]=(int)(Math.random()*10)+1;
			}
			
			if((num[0]==num[2])) {
				num[2]=(int)(Math.random()*10)+1;
			}
			if((num[1]==num[2])) {
				num[2]=(int)(Math.random()*10)+1;
			}
		}
		System.out.println("--------------------------------\n");
		System.out.println("Finalists");
		
		//숫자 낮은 순 bubble
		int inter;
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				if(num[j]>num[j+1]) {
					inter=num[j];
					num[j]=num[j+1];
					num[j+1]=inter;
				}
			}
		}
		//결과도출
		for(int i=0;i<3;i++) {
			System.out.println("> "+num[i]);
		}
	
		System.out.println("\n--------------------------------\n");

	}

}
