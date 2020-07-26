package org.Practice11_4.eclipse;

public class DayException extends Exception{

	public DayException() {
		super(">Invalid Day");
	}
	public DayException(String message) {
		super(message);
	}
}
