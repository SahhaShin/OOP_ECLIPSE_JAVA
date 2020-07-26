package org.Practice10_1_3.eclipse;

public class PayPlay {

	public static void main(String[] args) {
		
		System.out.println("create RegularPay...\n");
		
		RegularPay pay1=new RegularPay(10);
		
		System.out.println("RegularPay payrate: "+pay1.payRate);
		
		System.out.println("\n---------------------------------\n");
		
		System.out.println("create HazardPay...\n");
		HazardPay pay2=new HazardPay(10);
		
		
		System.out.println("HazardPay hours: 10\n");
		System.out.println("---------------------------------\n");
		
		System.out.println("payCalculator computePay: "+pay1.computePay(pay1.payRate));
		System.out.println("\nHazardPay computePay: "+pay2.computePay(10.0));
		
		
		

	}

}
