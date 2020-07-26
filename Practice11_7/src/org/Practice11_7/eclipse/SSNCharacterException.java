package org.Practice11_7.eclipse;

public class SSNCharacterException extends Exception{
	
	public SSNCharacterException() {
		super(">Invalid SSNCharacter");
	}
	
	public SSNCharacterException(String message) {
		super(message);
	}

}
