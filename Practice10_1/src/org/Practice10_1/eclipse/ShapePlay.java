package org.Practice10_1.eclipse;


public class ShapePlay {

	public static void main(String[] args) {
		
		Shape[] shape=new Shape[]{new Rectangle(5.0,4.0), new RightTriangle(5.0,4.0), new Circle(5.0),new Rectangle(4.0,4.0), new RightTriangle(4.0,4.0), new Circle(4.0),new Rectangle(4.0,4.0), new RightTriangle(4.0,4.0), new Circle(4.0)};
		
		
		System.out.println("create Array and input...\n");
		
		System.out.println("-----------------------\n");
		System.out.println("information");
		System.out.println("[0]Rectangle: height 5/width 4");
		System.out.println("[1]RightTriangle: height 5/width 4");
		System.out.println("[2]Circle: radius 5");
		System.out.println("[3]Rectangle: height 4/width 4");
		System.out.println("[4]RightTriangle: height 4/width 4");
		System.out.println("[5]Circle: radius 4");
		System.out.println("[6]Rectangle: height 4/width 4");
		System.out.println("[7]RightTriangle: height 4/width 4");
		System.out.println("[8]Circle: radius 4");
		System.out.println("\n-----------------------\n");
		
		System.out.println("Result Area\n");
		System.out.println("[0]"+shape[0].toString());
		System.out.println("[1]"+shape[1].toString());
		System.out.println("[2]"+shape[2].toString());
		System.out.println("[3]"+shape[3].toString());
		System.out.println("[4]"+shape[4].toString()); 
		System.out.println("[5]"+shape[5].toString());
		System.out.println("[6]"+shape[6].toString());
		System.out.println("[7]"+shape[7].toString());
		System.out.println("[8]"+shape[8].toString());
		
		System.out.println("\n-----------------------\n");
		
		System.out.println("Result equal\n");
		
		System.out.println("Rectangle: shape[0] and shape[3], they are equal? "+shape[0].equals(shape[3]));
		System.out.println("Rectangle: shape[3] and shape[6], they are equal? "+shape[3].equals(shape[6]));
		
		System.out.println("\nRightTriangle: shape[1] and shape[4], they are equal? "+shape[1].equals(shape[4]));
		System.out.println("RightTriangle: shape[4] and shape[7], they are equal? "+shape[4].equals(shape[7]));
		
		System.out.println("\nCircle: shape[2] and shape[5], they are equal? "+shape[2].equals(shape[5]));
		System.out.println("Circle: shape[5] and shape[8], they are equal? "+shape[5].equals(shape[8]));
		
		
		System.out.println("\n-----------------------\n");

	}

}
