package org.Practice6_12.eclipse;
import java.util.Scanner;
public class RationalNumberPlay {

	public static void main(String[] args) {
		
		int a;
		int b;
		
		System.out.println("<User input example> \n");
		System.out.println("Please Enter two integer");
		Scanner keyboard=new Scanner(System.in);
		
		System.out.print(">numerator: ");
		a=keyboard.nextInt();
		System.out.print(">denominator: ");
		b=keyboard.nextInt();
		
		System.out.println("\nCreate RationalNumber1...\n");
		RationalNumber num1=new RationalNumber(a,b);
		
		System.out.println("get double Value");
		System.out.println("result> "+num1.getValue());
		
		System.out.println("get a/b Value");
		System.out.println("result> "+num1.toString());
		
	
		System.out.println("\n-----------------------------------\n");
		
		System.out.println("<initial 0/1 example> \n");
		System.out.println("Create RationalNumber2...\n");
		System.out.println("sets the rational number 0/1...\n");
		RationalNumber num2=new RationalNumber();
		System.out.println("get double Value");
		System.out.println("result> "+num2.getValue());
		
		System.out.println("\nget a/b Value");
		System.out.println("result> "+num2.toString());
		
		System.out.println("-----------------------------------\n");
		
		
		

	}

}
