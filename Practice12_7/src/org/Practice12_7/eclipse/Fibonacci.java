package org.Practice12_7.eclipse;

public class Fibonacci {

	static int n=3;
	public static long Fibonacci(int times, int a, int b) {
		
		if(times==0) {
			return 0;
		}
		
		else {
			double r=(a+b)/(double)b;
			System.out.println("Fibbonacci #"+n+" = "+(a+b)+" ; "+(a+b)+"/"+b+"="+r);
			n++;
			
			return Fibonacci(times-1, b, a+b);
		}
		
	}

}
