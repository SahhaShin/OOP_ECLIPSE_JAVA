package org.Practice4_6.eclipse;

public class PurchaseDemo {

	public static void main(String[] args) {
		Purchase p1 = new Purchase();
		Purchase p2 = new Purchase();
		Purchase p3 = new Purchase();
		Purchase p4 = new Purchase();
		Purchase p5 = new Purchase();

		p1.readInput();
		p2.readInput();
		p3.readInput();
		p4.readInput();
		p5.readInput();

		System.out.println("-----------------");
		System.out.println("Puchased List\n");
		p1.writeOutput();
		System.out.println("");
		
		p2.writeOutput();
		System.out.println("");
		
		p3.writeOutput();
		System.out.println("");
		
		p4.writeOutput();
		System.out.println("");
		
		p5.writeOutput();
		System.out.println("");
		System.out.println("-----------------\n");

		double calc = p1.getTotalCost() + p2.getTotalCost() + p3.getTotalCost() + p4.getTotalCost() + p5.getTotalCost();
		System.out.println("\n********************");
		System.out.print("Total bill:");
		System.out.println("$" + calc);

	}

}
