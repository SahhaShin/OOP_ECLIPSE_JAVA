package org.Practice6_12.eclipse;

public class RationalNumber {
	
	int a;//분자
	int b;//분모
	
	
	//default constructor
	public RationalNumber() {
		a=0;
		b=1;
	}
	
	//constructor
	public RationalNumber(int numerator, int denominator) {
		a=numerator;
		b=denominator;
		
		simplified(a,b);
		
	}
	
	//약분화
	
	private void simplified(int numerator, int denominator) {
		
		int gcdNum;
		//최대공약수를 찾는다.
		gcdNum=gcd(numerator,denominator);
		
		a=a/gcdNum;
		b=b/gcdNum;
	}
	
	private static int gcd(int numerator, int denominator) {
		
		int temp;
		//분모가 0일 때
		if(denominator==0) {
			return numerator;//분자
		}
		
		//분자가 분모보다 작을 때
		else if(numerator<denominator) {
			temp=numerator;
			numerator=denominator;
			denominator=temp;
			
		}
		
		//분모가 0이 아닐때까지
		while(denominator!=0) {
			temp=numerator%denominator;
			numerator=denominator;
			denominator=temp;
		}
		
		return numerator;//분자
	}
	
	public double getValue() {
		double numer=(double)a;
		double denom=(double)b;
		
		double value=numer/denom;
		
		return value;
	}
	
	public String toString() {
		return a+" / "+b;
	}

}
