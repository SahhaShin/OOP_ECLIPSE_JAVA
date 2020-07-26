package org.Practice12_9.eclipse;
import java.util.Scanner;
public class GrainsPlay {

	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner(System.in);
		System.out.println("create test1...\n");
		Grains test1=new Grains();
		
		System.out.print("Please Enter a Squares number: ");
		int squares=keyboard.nextInt();
		System.out.println("\n---------------------result--------------------------\n");
		System.out.println("total number of grains: "+test1.getTotalGrains(squares, 1));

	}

}
