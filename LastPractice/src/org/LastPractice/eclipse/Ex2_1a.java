package org.LastPractice.eclipse;
import java.util.Scanner;
public class Ex2_1a {

	public static void main(String[] args) {
		/* 2_1a
		System.out.println("Please Enter a 4-digit");
		Scanner keyboard=new Scanner(System.in);
		
		int num=keyboard.nextInt();
		
		System.out.println("number is : "+num/1000);
		num%=1000;
		
		System.out.println("number is : "+num/100);
		num%=100;
		System.out.println("number is : "+num/10);
		num%=10;
		System.out.println("number is : "+num);
		
		keyboard.close();
		
		2_1b
		System.out.println("Please Enter a far");
		Scanner keyboard=new Scanner(System.in);
		
		double far=keyboard.nextDouble();
		
		double cel=5*(32-far)/9;
		
		System.out.println("cel : "+cel);
		
		keyboard.close();
		
		2_2
		System.out.println("Please Enter a sentence");
		Scanner keyboard=new Scanner(System.in);
		
		String line=keyboard.nextLine();
		
		int index=line.indexOf(" ");
		
		String sub1=line.substring(index+1)+" "+line.substring(0,index);
		String sub2=sub1.substring(0,1).toUpperCase()+sub1.substring(1);
		
		System.out.println("result: "+sub2);
		
		2_3
		System.out.println("Please Enter a price (25~100): ");
		Scanner keyboard=new Scanner(System.in);
		
		int price=keyboard.nextInt();
		if(price<25 || price>100) {
			System.out.println("error");
			
		}
		
		else if(price%5!=0) {
			System.out.println("error");
		}
		
		else {
			System.out.println("25_ : "+price/25);
			price%=25;
			
			System.out.println("10_ :"+price/10);
			price%=10;
			
			System.out.println("5_ :"+price/5);
			
			
		}
		*/
		Scanner keyboard=new Scanner(System.in);
		
		char a=keyboard.next().charAt(0);
		
		

	}

}
