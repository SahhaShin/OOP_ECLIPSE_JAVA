package org.Practice11_1_2.eclipse;


public class InvalidHourException extends InvalidTimeException {
	public InvalidHourException() {
		super(">Invalid hour\n");
	}
	public InvalidHourException(String message) {
		super(message);
	}
	
	public static boolean checkHour(String hh) {
		try {
			int inthh=Integer.parseInt(hh);
			if(inthh<0||inthh>12) {
				
				throw new InvalidHourException(">Invalid hour, hour as "+hh+"\n");
			
			}
			else {
				System.out.println(">Valid hour, hour as "+hh+"\n");
				return true;			
				
			}
		}
		catch(InvalidHourException err) {
			System.out.println(err.getMessage());
		}
		finally {
			return false;
		}
		
	}

}
