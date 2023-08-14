package canadaWonderland;

import java.util.Scanner;

public class FamilyKids extends Rides {
	String rideName;
	ThrillLevel thrillLevel;
	Scanner sc = new Scanner(System.in);
	private FamilyKids[] familyKidsArray = new FamilyKids[8];

	public FamilyKids(String typeOfRide, String rideName, int minGuestHeight, int minGuestWeight,
            ThrillLevel thrillLevel) {
        super(typeOfRide, minGuestHeight, minGuestWeight, thrillLevel);
        this.rideName = rideName;
        this.thrillLevel = thrillLevel;
    }
	private static FamilyKids[] initializeFamilyKidsRides() {
		FamilyKids[] familyKidsArray = new FamilyKids[8];
		familyKidsArray[0] = new FamilyKids("FamilyKids", "Antique Carrousel", 46, 20, ThrillLevel.LOW);
		familyKidsArray[1] = new FamilyKids("FamilyKids", "Blast Off", 36, 25, ThrillLevel.LOW);
		familyKidsArray[2] = new FamilyKids("FamilyKids", "Flying Eagles", 44, 35, ThrillLevel.MEDIUM);
		familyKidsArray[3] = new FamilyKids("FamilyKids", "Jokey's Jalopies", 46, 38, ThrillLevel.MEDIUM);
		familyKidsArray[4] = new FamilyKids("FamilyKids", "Klockwerks", 44, 40, ThrillLevel.HIGH);
		familyKidsArray[5] = new FamilyKids("FamilyKids", "Snoopy vs Red Baron", 48, 47, ThrillLevel.HIGH);
		familyKidsArray[6] = new FamilyKids("FamilyKids", "Speed City Raceway", 54, 45, ThrillLevel.EXTREME);
		familyKidsArray[7] = new FamilyKids("FamilyKids", "Super Soaker", 52, 45, ThrillLevel.EXTREME);
		return familyKidsArray;

	}

	 public static void displayAvailableFamilyKidsRides() {
	        FamilyKids[] familyKidsArray = initializeFamilyKidsRides();
	        System.out.println("Available Family Kids Rides are:");
	        for (FamilyKids familyKids : familyKidsArray) {
	            System.out.println(familyKids.rideName);
	        }
	    }
	 public static FamilyKids findFamilyKidsByName(String name) {
		    FamilyKids[] familyKidsArray = initializeFamilyKidsRides();
		    for (FamilyKids familyKids : familyKidsArray) {
		        if (familyKids.rideName.equalsIgnoreCase(name)) {
		            return familyKids;
		        }
		    }
		    return null;
		}

	 public static void selectAndDisplayRideDetails() {
	        System.out.println("\nEnter the family kids ride you want to experience:");
	        Scanner sc = new Scanner(System.in);
	        String familyKidsName = sc.nextLine();
	        FamilyKids familyKidsRide = findFamilyKidsByName(familyKidsName);
	        if (familyKidsRide != null) {
	            familyKidsRide.displayRideDetails();
	        } else {
	            System.out.println("Ride not found.");
	        }
	    }
	@Override
	public void displayRideDetails() {
		super.displayRideDetails();
		System.out.println("Family Kids Ride Details:");
		System.out.println("Ride Name: " + rideName);
		System.out.println("Thrill Level: " + thrillLevel);
	}

	@Override // Overridden from parent class
	public void ridesAndExperiences() {
		System.out.println(
				"Canada's Wonderland has two family-friendly areas within the park, KidZville and Planet Snoopy. "
						+ "\nAnd there are more than 25 kids attractions suitable for most little kids. ");

	}
}
