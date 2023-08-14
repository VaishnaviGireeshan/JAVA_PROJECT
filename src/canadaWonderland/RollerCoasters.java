package canadaWonderland;

import java.util.Scanner;

public class RollerCoasters extends Rides {
	private String rideName;
	private ThrillLevel thrillLevel;
	private int minGuestHeight;
	private int minGuestWeight;// in KG
	static Scanner sc = new Scanner(System.in);
	private static RollerCoasters[] rollerCoastersArray ;

	public RollerCoasters(String typeOfRide, String rideName, int minGuestHeight, int minGuestWeight,
			ThrillLevel thrillLevel) {
		super(typeOfRide, minGuestHeight, minGuestWeight, thrillLevel);
		this.rideName = rideName;
		this.thrillLevel = thrillLevel;
	}

	private static RollerCoasters[] initializeRollerCoasterRides() {

		rollerCoastersArray[0] = new RollerCoasters("RollerCoasters", "Taxi Jam", 40, 25, ThrillLevel.LOW);
		rollerCoastersArray[1] = new RollerCoasters("RollerCoasters", "Train Jam", 35, 20, ThrillLevel.LOW);
		rollerCoastersArray[2] = new RollerCoasters("RollerCoasters", "The Fly", 54, 45, ThrillLevel.MEDIUM);
		rollerCoastersArray[3] = new RollerCoasters("RollerCoasters", "Wilde Beast", 58, 48, ThrillLevel.MEDIUM);
		rollerCoastersArray[4] = new RollerCoasters("RollerCoasters", "Silver Streak", 44, 40, ThrillLevel.HIGH);
		rollerCoastersArray[5] = new RollerCoasters("RollerCoasters", "Vortex", 48, 47, ThrillLevel.HIGH);
		rollerCoastersArray[6] = new RollerCoasters("RollerCoasters", "Behemoth", 54, 45, ThrillLevel.EXTREME);
		rollerCoastersArray[7] = new RollerCoasters("RollerCoasters", "Yukon Strikerh", 52, 45, ThrillLevel.EXTREME);
		return rollerCoastersArray;

	}

	public static void displayAvailableRollerCoasterRides() {

		RollerCoasters[] rollerCoastersArray = initializeRollerCoasterRides();
		System.out.println("Available Roller Coaster Rides are:");
		for (RollerCoasters rollerCoaster : rollerCoastersArray) {
			System.out.println(rollerCoaster.rideName);
		}
	}

	public static RollerCoasters findRollerCoasterByName(String rideName) {
		RollerCoasters[] rollerCoastersArray = initializeRollerCoasterRides();
		for (RollerCoasters rollerCoaster : rollerCoastersArray) {
			if (rollerCoaster.rideName.equalsIgnoreCase(rideName)) {
				return rollerCoaster;
			}
		}
		return null;
	}

	public static void selectAndDisplayRideDetails() {
		System.out.println("\nEnter the roller coaster ride you want to experience:");
		
		String rollerCoasterName = sc.nextLine();
		RollerCoasters rollerCoaster = findRollerCoasterByName(rollerCoasterName);
		if (rollerCoaster != null) {
			rollerCoaster.displayRideDetails();
		} else {
			System.out.println("Ride not found.");
		}
	}

	@Override
	public void ridesAndExperiences() {
		System.out.println("Scientifically, a roller coaster works because of gravity, "
				+ "a force that pulls things down to the ground. \nMost roller "
				+ "coaster trains are pulled to the top of a hill on a chain. "
				+ "\nThe train will slide down the track, which has a number of hills " + "and valleys. ");

	}

	@Override
	public void displayRideDetails() {
		super.displayRideDetails();
		System.out.println("Roller Coaster Ride Details:");
		System.out.println("Ride Name: " + rideName);
		System.out.println("Thrill Level: " + thrillLevel);
	}

}
