package canadaWonderland;

import java.util.Scanner;

public class WonderLandMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Canada's Wonderland......\n--------------------------------------");

        System.out.println("Please choose an option:\n1. Explore Rides and Experiences\n2. Purchase Tickets");
        String choice = sc.nextLine();

        Rides rd = new Rides(null, 0, 0, null);
        rd.ridesAndExperiences();

        switch (choice) {
            case "1":
                System.out.println("Enter the ride you would like to learn more about\n-------------------------------------------------\n-Roller Coaster\n-Family Kids");
                String attractionType = sc.nextLine();

                switch (attractionType.toLowerCase()) {
                    case "roller coaster":
                        RollerCoasters.displayAvailableRollerCoasterRides();
                        RollerCoasters.selectAndDisplayRideDetails();
                        break;
                    case "family kids":
                        FamilyKids.displayAvailableFamilyKidsRides();
                        FamilyKids.selectAndDisplayRideDetails();
                        break;
                    default:
                        System.out.println("Enter a valid ride");
                        break;
                }
                break;
            case "2":
            	
            	Tickets tickets = new Tickets(0, null, null);
            	tickets.PurchaseTickets();
                double totalPrice = tickets.calPrice();
                
                System.out.println("Your total ticket price: $" + totalPrice);
                
                AddOns addOns = new AddOns(0, null, null, null);
                double addOnPrice = addOns.includeAddOn();
                totalPrice += addOnPrice;
                
                System.out.println("Your total price including add-ons: $" + totalPrice);
            	
            	
                // Implement ticket purchasing logic here
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
