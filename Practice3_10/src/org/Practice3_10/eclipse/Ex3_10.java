package org.Practice3_10.eclipse;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex3_10 {
	
	//전역변수
	public static final double INTEREST_RATE = 5;
	public static final double YEARLY_INTEREST = INTEREST_RATE;
	public static final double MONTLY_INTEREST = INTEREST_RATE / 12;
	public static final double DAILY_INTEREST = INTEREST_RATE / 365;
	

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		boolean resume = true;

		do{
			System.out.print("Please Enter current balance:");
			double balance = keyboard.nextDouble();
		
			//10년
			for(int year = 1; year <= 10; year++){
				double dailyInterest = balance * (DAILY_INTEREST / 100);//1만원이면1.37
				double montlyInterest = balance * (MONTLY_INTEREST / 100);
				double yearlyInterest = balance * (YEARLY_INTEREST / 100);

				double yBalance = balance + yearlyInterest;

				System.out.println("");
				System.out.println("-----------------------------------------");
				System.out.println(year+" Year");
				System.out.println("Daily Interest: " +dailyInterest);
				System.out.println("Montly Interest: " +montlyInterest);
				System.out.println("Yearly Interest: " +yearlyInterest);
				System.out.println("Total"+"("+year+"year)" + " : " +yBalance);
				System.out.println("-----------------------------------------");

				balance = yBalance;
			}

			System.out.print("\nEND (yes / no)? ");
			String again = keyboard.next();

			if(again.equalsIgnoreCase("yes")){
				System.out.println("\nRESTART\n");
			}
			else if(again.equalsIgnoreCase("no")){
				System.out.println("\nBYE");
				resume = false;
			}
			else{
				while((again.equalsIgnoreCase("yes")||again.equalsIgnoreCase("no"))==false) {
					System.out.println("Please Enter yes OR no");
					again = keyboard.next();
				}
				if(again.equalsIgnoreCase("yes")){
					System.out.println("\nRESTART\n");
				}
				else if(again.equalsIgnoreCase("no")){
					System.out.println("\nBYE");
					resume = false;
				}
			}
			System.out.println("");
		
		}while(resume);

	}

}
