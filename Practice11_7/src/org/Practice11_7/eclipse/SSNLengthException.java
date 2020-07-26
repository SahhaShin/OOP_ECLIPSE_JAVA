package org.Practice11_7.eclipse;

public class SSNLengthException extends Exception {

	public SSNLengthException() {
		super(">Invalid SSNLength");
	}
	public SSNLengthException(String message) {
		super(message);
	}
}
