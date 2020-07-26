package org.Practice11_1_1.eclipse;


public class InvalidTimeException extends Exception {
	public InvalidTimeException(String message) {
		super(message);
	}
	public InvalidTimeException() {
		super(">InvalidTime...\n");
	}
	
	
	public static boolean checkTime(String t) {
		try {
			String hh="";
			String mm="";
			String xx="";
			int inthh,intmm;
			int split1=t.indexOf(':');//mm
			int split2=t.indexOf(' ');//xx
			
			if(split1!=2||split2!=5)
				throw new InvalidTimeException();
			else {
				hh=t.substring(0,split1);
				inthh=Integer.parseInt(hh);
				mm=t.substring(split1+1,split2);
				intmm=Integer.parseInt(mm);
				xx=t.substring(split2+1,split2+3);
				
				
				if((inthh<0||inthh>12)&&(!xx.equals("am")||!xx.equals("pm"))||(intmm<0||intmm>59)) {
					
					throw new InvalidTimeException();
					
				}
				
				else {
					System.out.println(">ValidTime");
					return true;
				}
			}
		}
		catch(InvalidTimeException err) {
			System.out.println(err.getMessage());
		}
		finally {
			return false;
		}
	}

}
