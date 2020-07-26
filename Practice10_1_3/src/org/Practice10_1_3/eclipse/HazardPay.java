package org.Practice10_1_3.eclipse;

public class HazardPay extends PayCalculator {
	public HazardPay(double payrate) {
		payRate=payrate;
	}
	
	public double computePay(double hours) {
		return 1.5*super.computePay(hours);
	}

}
