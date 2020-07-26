package org.Practice4_5.eclipse;

import java.util.Scanner;

public class GradeDistribution {
	
	int a_num;
	int b_num;
	int c_num;
	int d_num;
	int f_num;
	double totalNumber;
	
	
	
	public void setGradeNum() {
		a_num=0;
		b_num=0;
		c_num=0;
		d_num=0;
		f_num=0;
		
	}
	
	public void EnterNum() {
		System.out.println("Please Enter the Number of each of the letter grades A, B, C, D, and F\n");
		
		System.out.print("A: ");
		Scanner keyboard=new Scanner(System.in);
		a_num=keyboard.nextInt();
		System.out.print("B: ");
		b_num=keyboard.nextInt();
		System.out.print("C: ");
		c_num=keyboard.nextInt();
		System.out.print("D: ");
		d_num=keyboard.nextInt();
		System.out.print("F: ");
		f_num=keyboard.nextInt();
		System.out.println("\n---");
		
	}
	
	 
	
	public void totalNum() {
		totalNumber=a_num+b_num+c_num+d_num+f_num;
		
		System.out.println("\nTotal Number : "+totalNumber);
		System.out.println("\n---\n");
	}
	
	public void percentageGrade(){
		double a_per=(a_num/totalNumber)*100;
		double b_per=(b_num/totalNumber)*100;
		double c_per=(c_num/totalNumber)*100;
		double d_per=(d_num/totalNumber)*100;
		double f_per=(f_num/totalNumber)*100;
		
		
		System.out.println("Percentage");
		System.out.println("A "+a_per+"%, "+"B "+b_per+"%, "+"C "+c_per+"%, "+"D "+d_per+"% and "+"F "+f_per+"%");
		System.out.println("\n---\n");
	}
	
	public void perBar(){
		System.out.println("0   10   20   30   40   50   60   70   80   90   100%");
		System.out.println("|    |    |    |    |    |    |    |    |    |    |   ");
		System.out.println("**************************************************");
		double a_star=50*(a_num/totalNumber);
		a_star=Math.round(a_star);
		
		
		for(int i=0;i<a_star;i++) {
			System.out.print("*");
		}
		System.out.print("A\n");
		
		double b_star=50*(b_num/totalNumber);
		b_star=Math.round(b_star);
		
		
		for(int i=0;i<(int)b_star;i++) {
			System.out.print("*");
		}
		System.out.print("B\n");
		
		double c_star=50*(c_num/totalNumber);
		c_star=Math.round(c_star);
		
		
		for(int i=0;i<(int)c_star;i++) {
			System.out.print("*");
		}
		System.out.print("C\n");
		
		double d_star=50*(d_num/totalNumber);
		d_star=Math.round(d_star);
		
		for(int i=0;i<(int)d_star;i++) {
			System.out.print("*");
		}
		System.out.print("D\n");
		
		double f_star=50*(f_num/totalNumber);
		f_star=Math.round(f_star);
		
		
		for(int i=0;i<(int)f_star;i++) {
			System.out.print("*");
		}
		System.out.print("F\n");
	}

	public static void main(String[] args) {
		
		GradeDistribution result1=new GradeDistribution();
		result1.setGradeNum();
		result1.EnterNum();
		result1.totalNum();
		result1.percentageGrade();
		result1.perBar();

	}
}
