package org.Practice11_2.eclipse;
import java.util.Scanner;

public class TimeNotation {

	public static void main(String[] args) {
		String hour;
		String minutes;
		
		
		char ch='y';
		String hh,mm,time;
		String xx;
		
		while((ch=='y')||(ch=='Y')) {
			
			try {
				Scanner keyboard=new Scanner(System.in);
				System.out.println("Enter time in 24-hour notation:");
				
				time=keyboard.nextLine();
				
				int split=time.indexOf(':');
				
				if(split!=2)
					throw new TimeFormatException();
				else {
					hh=time.substring(0,split);
					mm=time.substring(3);
				}
				
				int inthh=Integer.parseInt(hh);
				int intmm=Integer.parseInt(mm);
				
				if(inthh<0||inthh>23) {
					//System.out.println("There is no such hour as "+inthh);
					throw new TimeFormatException("There is no such hour as "+hh+":"+mm);
				}
				
				else if(intmm<0||intmm>59) {
					//System.out.println("There is no such minute as "+intmm);
					throw new TimeFormatException("There is no such minute as "+hh+":"+mm);
				}
				
				else {
					if(inthh==12) {
						xx="PM";
						System.out.println("This is the same as \n"+inthh+":"+intmm+xx);
					}
					else if(inthh<12) {
						xx="AM";
						System.out.println("This is the same as \n"+inthh+":"+intmm+xx);
						
					}
					
					else if(inthh>12) {
						inthh=inthh-12;
						hh=Integer.toString(inthh);
						xx="PM";
						System.out.println("This is the same as \n"+hh+":"+mm+xx);
						
					}
					
					
					System.out.println("Try Again?(y/n)");
					String again=keyboard.next();
					
					ch=again.charAt(0);
					if(ch=='n'||ch=='N') {
						System.exit(0);
					}
				}
			}
			catch(Exception err) {
				System.out.println(err.getMessage());
				System.out.println("Try Again: ");
			}
			
				
		}
		System.out.println("End of program\n");
		
		

	}

}
