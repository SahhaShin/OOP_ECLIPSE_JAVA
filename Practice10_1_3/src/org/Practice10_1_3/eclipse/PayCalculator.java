package org.Practice10_1_3.eclipse;

public abstract class PayCalculator {
	
	double payRate;
	
	public double computePay(double hours) {
		return this.payRate*hours;
	}

}
