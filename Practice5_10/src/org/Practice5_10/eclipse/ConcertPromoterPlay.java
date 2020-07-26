package org.Practice5_10.eclipse;
import java.util.Scanner;
public class ConcertPromoterPlay {

	public static void main(String[] args) {
		
		System.out.println("Program Start...\n");
		System.out.println("create Concert...\n");
		ConcertPromoter concert=new ConcertPromoter("ABC", 10, 10.0, 15.0);
		
		System.out.println("-------------------------");
		System.out.println("CONCERT INFORMATION\n");
		System.out.println("BAND name: "+concert.getName());
		System.out.println("VENUE capacity: "+concert.getCapacity());
		System.out.println("Price _ phone: "+concert.getPriceTicket_phone());
		System.out.println("Price _ Venue: "+concert.getPriceTicket_venue());
		System.out.println("-------------------------\n\n");
		
		Scanner keyboard=new Scanner(System.in);
		int menu=100;
		
		while(menu!=0) {
			System.out.println("Please Enter a number(0~5)");
			System.out.println("0(terminate) / 1(sell) / 2(change mode) / 3(number of tickets sold) / 4(number of tickets remaining) / 5(total tickets sales)");
			System.out.print("> ");
			menu=keyboard.nextInt();
			
			if(menu==0) {
				System.out.println(">Program terminate...\n");
				continue;
			}
			
			else if(menu==1) {
				System.out.println(">Buy a ticket...\n");
				concert.recordTicket();
				
			}
			
			else if(menu==2) {
				concert.changeMode();
				
			}
			
			else if(menu==3) {
				System.out.println(">number of tickets sold: "+concert.getTicketSold()+"\n");
				
			}
			
			else if(menu==4) {
				System.out.println(">number of tickets remaining: "+concert.getremainingTicket()+"\n");
				
			}
			
			else if(menu==5) {
				System.out.println(">total tickets sales: "+concert.getTotalSales()+"\n");
				
			}
			
			else {
				System.out.println(">Error!\n");
			}
			
		}
		
		System.out.println("\nFinalize Tickets sold");
		System.out.println("-------------------------");
		System.out.println("CONCERT INFORMATION\n");
		System.out.println("BAND name: "+concert.getName());
		System.out.println("number of tickets remaining: "+concert.getremainingTicket());
		System.out.println("Tickets sold: "+concert.getTicketSold());
		System.out.println("TotalSales: "+concert.getTotalSales());
		System.out.println("-------------------------\n\n");
		
		
		
		

	}

}
