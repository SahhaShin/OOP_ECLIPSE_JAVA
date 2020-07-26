package org.Practice10_1_2.eclipse;


public class Rectangle implements Shape {
	
	double height;
	double width;
	
	public Rectangle(double height, double width) {
		this.height=height;
		this.width=width;
	}
	
	public double getArea() {
		return height*width;
	}
	
	public String toString() {
		return "Rectangle Area is "+getArea()+"\n";
	}
	
	
	//��Object otherobject�� ����� �� �� �ƴϸ� �ȸ���.
	public boolean equals(Object otherobject) {
	
		if(!(otherobject!=null&&otherobject instanceof Rectangle)) {
			
			return false;
		}
		Rectangle otherRectangle=(Rectangle)otherobject;
		
		return ((this.height==otherRectangle.height)&&(this.width==otherRectangle.width));
		
	}

}
