package canadaWonderland;

import java.util.Scanner;

public class AddOns extends Tickets {
    private String addOns;
    double addOnPrice ;
    private static AddOns[] addOnsArray;
    Scanner sc = new Scanner(System.in);
    public AddOns(int visiterId, String visiterName, String visiterType, String addOns) {
        super(visiterId, visiterName, visiterType);
        this.addOns = addOns;
    }
    

	
    
	public double includeAddOn() {
	    System.out.println("Try AddOns?\n1. FunPix\n2. Cabanas");
	    String selectedAddOn = sc.nextLine();

	  addOnPrice = (selectedAddOn.equals("1")) ? 25 : (selectedAddOn.equals("2")) ? 100 : 0;
	    if (addOnPrice == 0) {
	        System.out.println("Invalid add-on selection");
	    } else {
	        System.out.println("Add-on selected: " + selectedAddOn);
	        System.out.println("Add-on price: $" + addOnPrice);
	    }
		return addOnPrice;
	}
	@Override
	public double calPrice() {
		
		double finalPrice =  PurchaseTickets()+ (PurchaseTickets()*tax)+addOnPrice;
		return finalPrice;
		
	}
	
}
	


