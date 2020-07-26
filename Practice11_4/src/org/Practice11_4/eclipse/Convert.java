package org.Practice11_4.eclipse;
import java.util.Scanner;
public class Convert {
	String change_mm;
	int mm;
	int dd;
	
	public void set_mm(int mm){
		this.mm=mm;
	}
	public int get_mm() {
		return mm;
	}
	public void set_dd(int dd) {
		this.dd=dd;
	}
	public int get_dd() {
		return dd;
	}
	public String get_change_mm() {
		return change_mm;
	}
	
	public void convert_month() {
		try {
			switch(mm) {
			case 1:
				if(mm==1) change_mm="January";
				if(dd>31)
					throw new DayException();
				break;
			case 2:
				if(mm==2) change_mm="February";
				if(dd>28)
					throw new DayException();
				break;
			case 3:
				if(mm==3) change_mm="March";
				if(dd>31)
					throw new DayException();
				break;
			case 4:
				if(mm==4) change_mm="April";
				if(dd>30)
					throw new DayException();
				break;
			case 5:
				if(mm==5) change_mm="May";
				if(dd>31)
					throw new DayException();
				break;
			case 6:
				if(mm==6) change_mm="June";
				if(dd>30)
					throw new DayException();
				break;
			case 7:
				if(mm==7) change_mm="July";
				if(dd>31)
					throw new DayException();
				break;
			case 8:
				if(mm==8) change_mm="August";
				if(dd>31)
					throw new DayException();
				break;
			case 9:
				if(mm==9) change_mm="September";
				if(dd>30)
					throw new DayException();
				break;
			case 10:
				if(mm==10) change_mm="October";
				if(dd>31)
					throw new DayException();
				break;
			case 11:
				if(mm==11) change_mm="November";
				if(dd>30)
					throw new DayException();
				break;
				
			case 12:
				if(mm==12) change_mm="December";
				if(dd>31)
					throw new DayException();
				break;
			default:
				break;
			}
		}
		catch(DayException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
	public void mm_validation() {
		try {
			if(mm<0||mm>12) {
				throw new MonthException();
			}
		}
		catch(MonthException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
	public void display() {
		System.out.println(">After: "+get_change_mm()+" "+dd);
	}
	public static void main(String args[]) {
		System.out.println("create date 1...\n");
		Convert date1=new Convert();
		
		Scanner keyboard=new Scanner(System.in);
		System.out.print(">Please Enter a month(1~12): ");
		int mm=keyboard.nextInt();
		date1.set_mm(mm);
		
		System.out.println(">check month validation...\n");
		date1.mm_validation();
		
		System.out.println("\nmm1,3,5,7,8,10,12 : 1~31\nmm2 : 1~28\nmm4,6,9,11 : 1~30");
		System.out.print(">Please Enter a day(1~29 or 30 or 31): ");
		int dd=keyboard.nextInt();
		date1.set_dd(dd);
		
		System.out.println(">check day validation and convert month...\n");
		date1.convert_month();
		
		System.out.println("\n-----------------result------------------\n");
		System.out.println(">Before: "+date1.get_mm()+" / "+date1.get_dd());
		date1.display();
		System.out.print("\n-----------------------------------------\n");
		
		
	}

}
