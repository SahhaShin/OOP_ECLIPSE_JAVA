package org.Practice10_1_2.eclipse;


public class RightTriangle implements Shape {
	double height,width;
	
	public RightTriangle(double height, double width) {
		this.height=height;
		this.width=width;
	}
	
	public double getArea() {
		return height*width*0.5;
	}
	
	public String toString() {
		return "RightTriangle Area is "+getArea()+"\n";
	}
	
	
	//꼭Object otherobject로 만들어 줄 것 아니면 안먹음.
	public boolean equals(Object otherobject) {
		
		if(!(otherobject!=null&&otherobject instanceof RightTriangle))
			return false;
		
		RightTriangle otherRightTriangle=(RightTriangle)otherobject;
		return (this.height==otherRightTriangle.height)&&(this.width==otherRightTriangle.width);
	}

}
