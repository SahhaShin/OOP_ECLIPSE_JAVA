package org.Practice7_2_3.eclipse;

import java.util.Scanner;

public class Polynomial {
	
	private int degree=0;
	private double[] coefficientes;
	
	//constructor
	public void Polynomial(int max) {
		this.degree=max;
		coefficientes=new double[degree+1];//뒤에 배열 사이즈 정해주기
		for(int i=0;i<coefficientes.length;i++) {
			coefficientes[i]=0;
		}
	}
	
	public void setConstant(int i, int value) {
		
		coefficientes[i]=value;
		
	}
	
	public double evaluate(double x) {
		
		double result=0;
		System.out.print("P(x)= ");
		for(int i=0;i<coefficientes.length;i++) {
		if(coefficientes[i]!=0) {
			System.out.print(coefficientes[i]);
			if(i==1)System.out.print("X");
			if(i!=0&&i!=1)System.out.print("X^"+i);
			if(i!=degree)System.out.print(" + ");
		}
		
		}
		for(int i=0;i<coefficientes.length;i++) {
			result+=coefficientes[i]*Math.pow(x, i);
		}
		
		result=Math.round(result*100.0)/100.0;
		
		return result;
	}

}
