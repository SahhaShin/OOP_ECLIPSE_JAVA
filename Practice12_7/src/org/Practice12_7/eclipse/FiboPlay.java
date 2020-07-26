package org.Practice12_7.eclipse;
import java.util.Scanner;
public class FiboPlay {

	public static void main(String[] args) {
		
		System.out.println("create test1...\n");
		Fibonacci test1=new Fibonacci();
		Scanner keyboard=new Scanner(System.in);
		
		System.out.print("What times? ");
		int times=keyboard.nextInt();
		
		if(times==1) {
			System.out.println("Fibonacci #1 = 0");
		}
		else if(times>=2) {
			System.out.println("Fibonacci #1 = 0");
			System.out.println("Fibonacci #2 = 1");
			
		}
		test1.Fibonacci(times-2,0,1);
	}

}
