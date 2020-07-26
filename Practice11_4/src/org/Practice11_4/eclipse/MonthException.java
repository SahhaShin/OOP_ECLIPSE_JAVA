package org.Practice11_4.eclipse;

public class MonthException extends Exception{
	public MonthException() {
		super(">InValid Month");
	}
	public MonthException(String message) {
		super(message);
	}

}
