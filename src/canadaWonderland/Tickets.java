package canadaWonderland;

import java.util.Scanner;

public class Tickets extends Visiter {
	private String visiterType;
	private static Tickets[] ticketsArray;
	double  tax=.8;
	int ticketPrice = 0;
	Scanner sc = new Scanner(System.in);
	public Tickets(int visiterId, String visiterName, String visiterType) {
		super(visiterId, visiterName);
		this.visiterType = visiterType;

	}

	
public int PurchaseTickets() {
	System.out.println("Enter your name:");
	String visiterName=sc.nextLine();
	
	System.out.println("Which ticket you want \nRegular\nSeason Pass");
	String visiterType=sc.nextLine();
	
	
	switch (visiterType) {
	case "Regular":
		 ticketPrice=80;
		break;
	case "Season Pass":
		ticketPrice=120;
		break;
	default:System.out.println("Invalid ticket type");
		break;
	}
	return ticketPrice;
	
	
	
}
	
public double calPrice() {
	
	double finalPrice =  ticketPrice+ (ticketPrice*tax);
	return finalPrice;
	
}
	
}
