package org.Practice6_10.eclipse;

public class Temperature {
	
	private double degrees=0.0;
	private char scale;
	
	public Temperature() {
		degrees=0.0;
		scale='C';
	}
	
	public Temperature(double newDegrees) {
		degrees=newDegrees;
		scale='C';
	}
	
	public Temperature(char newScale) {
		degrees=0.0;
		scale=newScale;
	}
	
	public Temperature(double newDegrees, char newScale) {
		degrees=newDegrees;
		scale=newScale;
		
	}
	
	public double getDegreesCelius() {
		if(scale=='C') {
			return degrees;
		}
		
		double celsius=5*(degrees-32)/9;
		celsius=Math.round(celsius);
		
		return celsius;
	}

	
	public double getDegreesFahrenheit() {
		if(scale=='F') {
			return degrees;
		}
		double fahrenheit=9*(degrees/5)+32;
		
		fahrenheit=Math.round(fahrenheit);
		
		return fahrenheit;
	}
	
	public void setDgrees(double newDegrees) {
		degrees=newDegrees;
	}
	
	public void setScale(char newScale) {
		scale=newScale;
	}
	
	public void setDegreesScale(double newDegrees, char newScale) {
		degrees=newDegrees;
		scale=newScale;
	}
	
	public boolean isEqualTemperature(Temperature newTemperature) {
		if(scale=='C') {
			if(newTemperature.scale=='C') {
				return (degrees==newTemperature.degrees);
			}
			else return (degrees==newTemperature.getDegreesCelius());
		
		}
		else {
			if(newTemperature.scale=='F') {
				return (degrees==newTemperature.degrees);
			}
			else return (degrees==newTemperature.getDegreesFahrenheit());
				
		}
		
	}
	
	public boolean isLessTemperature(Temperature newTemperature) {
		if(scale=='C') {
			if(newTemperature.scale=='C') { 
				return(degrees<newTemperature.degrees);
			}
			else {
				return(degrees<newTemperature.getDegreesCelius());
			}
		}
		else {
			if(newTemperature.scale=='F') {
				return(degrees<newTemperature.degrees);
				
			}
			else {
				return (degrees<newTemperature.getDegreesFahrenheit());
			}
		}
	}
	
	public boolean isGreaterTemperature(Temperature newTemperature) {
		if(scale=='C') {
			if(newTemperature.scale=='C') {
				return (degrees>newTemperature.degrees);
			}
			else {
				return (degrees>newTemperature.getDegreesCelius());
			}
		}
		else {
			if(newTemperature.scale=='F') {
				return(degrees>newTemperature.degrees);
			}
			else {
				return(degrees>newTemperature.getDegreesFahrenheit());
			}
		}
	}
	
	public String toString() {
		return degrees+""+scale;
	}
}
