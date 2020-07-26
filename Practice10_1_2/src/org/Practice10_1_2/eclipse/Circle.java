package org.Practice10_1_2.eclipse;


public class Circle implements Shape {
	
	double radius;
	
	public Circle(double radius) {
		this.radius=radius;
		
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public String toString() {
		return "Circle Area is "+getArea()+"\n";
	}
	
	//꼭Object otherobject로 만들어 줄 것 아니면 안먹음.
	public boolean equals(Object otherobject) {
		
		if(!(otherobject!=null&&otherobject instanceof Circle))
			return false;
		Circle otherCircle=(Circle)otherobject;
		return (this.radius==otherCircle.radius);
	}

}
