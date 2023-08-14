package canadaWonderland;

import java.util.Scanner;

public class WonderLandMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Canada's Wonderland......\n--------------------------------------");
        
        // Since you don't have default values for the Rides constructor, replace the nulls with appropriate values
        Rides rd = new Rides(null, 0, 0, null);
        rd.ridesAndExperiences();

        System.out.println("Enter the ride you would like to learn more about\n-------------------------------------------------\n-Roller Coaster\n-Family Kids");
        String attractionType = sc.nextLine();

        switch (attractionType) {
            case "Roller Coaster":
            	  RollerCoasters.displayAvailableRollerCoasterRides();
            	  RollerCoasters.selectAndDisplayRideDetails();
            	    break;
               
            case "Family Kids":
            	 FamilyKids.displayAvailableFamilyKidsRides();
            	 FamilyKids.selectAndDisplayRideDetails();
                break;
            default:
                System.out.println("Enter a valid ride");
                break;
        }
    }
}
