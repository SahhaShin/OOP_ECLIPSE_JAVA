package org.Practice5_10.eclipse;

public class ConcertPromoter {
	
	private String bandName;
	private int capacityOfVenue;
	private int ticketSold=0;//��
	private double priceTicket_phone;//$
	private double priceTicket_venue;//$
	private double totalAmount;//�Ѹ����
	
	private String mode = "PHONE";
	
	//additional constructor method
	public ConcertPromoter(String name, int capacity, double price_p, double price_v) {
		this.bandName=name;
		this.capacityOfVenue=capacity;
		this.priceTicket_venue=price_v;
		this.priceTicket_phone=price_p;
	}
	
	//additional method . getter method
	public String getName() {
		return bandName;
	}
	public int getCapacity() {
		return capacityOfVenue;
	}
	public double getPriceTicket_venue() {
		return priceTicket_venue;
	}
	public double getPriceTicket_phone() {
		return priceTicket_phone;
	}

	//real method start
	
	
	//method1. Record the sale of one or more tickets
	public void recordTicket() {
		
		//Ƽ���Ǹſ� ������ �¼� ���� ������ �� �ȸ� ���̴�.
		if(ticketSold == capacityOfVenue) {
	           System.out.println("Sold Out!\n");
	     }
			
		//��� ��忡�� ��� �ִ��� �� ��Ȳ�� �˷��ش�.
	    System.out.println("Now " + mode + " mode.");
	       
	    //�ڵ������� ������ ��
	    if(mode.equals("PHONE")) {
	    	
	        System.out.println("price a Ticket sold by phone: " + priceTicket_phone);
	        totalAmount += (priceTicket_phone);
	    } 
	       
	    //���� ���屸�� ��
	    else {
	        System.out.println("price a Ticket sold at the concert : " + priceTicket_venue);
	        totalAmount += (priceTicket_venue);          
	    }
	    
	    //Record the sale
	    ticketSold += 1;
	    System.out.println("Remianing Seats: " + getremainingTicket()+"\n");
	}
	
	//method2. Change from phone sales to sales at the concert venue
	public void changeMode() {
		System.out.println(">Change from phone sales to sales at the concert venue!\n");
		mode = "VENUE";
		System.out.println(">Now " + mode + " mode\n");
	    
	}
	
	
	//method3. Return the number of tickets sold
	public int getTicketSold() {
		return ticketSold;
	}
	
	
	//method4. Return the number of tickets remaining
	public int getremainingTicket() {
		return capacityOfVenue - ticketSold;
	}
	
	//method5. Return the total sales for the concert
	public double getTotalSales() {
		return totalAmount;
	}
	
}
