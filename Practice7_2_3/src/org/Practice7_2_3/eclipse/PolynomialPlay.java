package org.Practice7_2_3.eclipse;

public class PolynomialPlay {

	public static void main(String[] args) {
		double result=0;
		
		System.out.println("Start Program...");
		System.out.println("\nCreate poly1...");
		Polynomial poly1=new Polynomial();
		
		System.out.println("\npoly1 Enter max degree 3\n");
		poly1.Polynomial(3);
		
		System.out.println("\npoly1 Enter i:0 / value:3\n");
		poly1.setConstant(0, 3);
		
		System.out.println("\npoly1 Enter i:1 / value:5\n");
		poly1.setConstant(1, 5);
		
		System.out.println("\npoly1 Enter i:2 / value:0\n");
		poly1.setConstant(2, 0);
		
		System.out.println("\npoly1 Enter i:3 / value:2\n");
		poly1.setConstant(3, 2);
		
		result=poly1.evaluate(1);
		System.out.println("\n\nresult of x=1: "+result);
		System.out.println("\n--------------------------\n\n");
		
		System.out.println("\nCreate poly2...");
		Polynomial poly2=new Polynomial();
		System.out.println("\npoly2 Enter max degree 4\n");
		poly2.Polynomial(4);
		
		System.out.println("\npoly2 Enter i:0 / value:1\n");
		poly2.setConstant(0, 1);
		
		System.out.println("\npoly2 Enter i:1 / value:2\n");
		poly2.setConstant(1, 2);
		
		System.out.println("\npoly2 Enter i:2 / value:3\n");
		poly2.setConstant(2, 3);
		
		System.out.println("\npoly2 Enter i:3 / value:4\n");
		poly2.setConstant(3, 4);
		
		System.out.println("\npoly2 Enter i:4 / value:5\n");
		poly2.setConstant(4, 5);
		
		result=poly2.evaluate(2);
		System.out.println("\n\nresult of x=2: "+result);
		System.out.println("\n--------------------------\n\n");
		System.out.println("\nCreate poly3...");
		Polynomial poly3=new Polynomial();
		System.out.println("\npoly3 Enter max degree 2\n");
		poly3.Polynomial(2);
		
		
		System.out.println("\npoly3 Enter i:0 / value:3\n");
		poly3.setConstant(0, 3);
		
		System.out.println("\npoly3 Enter i:1 / value:2\n");
		poly3.setConstant(1, 2);
		
		System.out.println("\npoly3 Enter i:2 / value:1\n");
		poly3.setConstant(2, 1);
		
		result=poly3.evaluate(3);
		System.out.println("\n\nresult of x=3: "+result);
		System.out.println("\n--------------------------\n\n");

	}

}
