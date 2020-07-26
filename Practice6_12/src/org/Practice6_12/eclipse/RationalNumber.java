package org.Practice6_12.eclipse;

public class RationalNumber {
	
	int a;//����
	int b;//�и�
	
	
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
	
	//���ȭ
	
	private void simplified(int numerator, int denominator) {
		
		int gcdNum;
		//�ִ������� ã�´�.
		gcdNum=gcd(numerator,denominator);
		
		a=a/gcdNum;
		b=b/gcdNum;
	}
	
	private static int gcd(int numerator, int denominator) {
		
		int temp;
		//�и� 0�� ��
		if(denominator==0) {
			return numerator;//����
		}
		
		//���ڰ� �и𺸴� ���� ��
		else if(numerator<denominator) {
			temp=numerator;
			numerator=denominator;
			denominator=temp;
			
		}
		
		//�и� 0�� �ƴҶ�����
		while(denominator!=0) {
			temp=numerator%denominator;
			numerator=denominator;
			denominator=temp;
		}
		
		return numerator;//����
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
