package org.Practice11_1_2.eclipse;

public class InvalidMinuteException extends InvalidTimeException {
	public InvalidMinuteException() {
		super(">Invalid minute\n");
	}
	public InvalidMinuteException(String message) {
		super(message);
	}
	
	public static boolean checkMinute(String mm){
		try {
			int intmm=Integer.parseInt(mm);
			if(intmm<0||intmm>59) {
			
				throw new InvalidMinuteException(">Invalid minute, minute as "+mm+"\n");
			
			}
			else {
				System.out.println(">Valid minute, minute as "+mm+"\n");
				return true;			
				
			}
		}
		catch(InvalidMinuteException err) {
			System.out.println(err.getMessage());
		}
		finally {
			return false;
		}
	}

}
