package canadaWonderland;

public class Rides {
	// to implement encapsulation variables are declared as private,
	// only accessing (getter and setter)methods

	protected String typeOfRide;
	private int minGuestHeight;
	private int minGuestWeight;// in KG
	private int numOfVisitsPerDay;
	ThrillLevel levelOfThrill;

	public Rides(String typeOfRide, int minGuestHeight, int minGuestWeight, ThrillLevel thrill) {
		this.typeOfRide = typeOfRide;
		this.minGuestHeight = minGuestHeight;
		this.minGuestWeight = minGuestHeight;
		this.levelOfThrill = thrill;

	}

	public void ridesAndExperiences() {
		System.out.println("Canada’s Wonderland has something for every guest, from the "
				+ "\nbig thrills of its 18 roller coasters like Yukon Striker, "
				+ "\nLeviathan and Behemoth to the little thrills of Planet Snoopy and KidZville!\n"
				+ "*Attractions and shows may close without notice.\n");

	}

	public void displayRideDetails() {

		System.out.println("Type of Ride  " + typeOfRide);

	}

	/*----------------------------enum--------------------------*/
	enum ThrillLevel {
		LOW("Low"), MEDIUM("Medium"), HIGH("High"), EXTREME("Extreme");

		String levelOfThrill;

		private ThrillLevel(String thrill) {
			levelOfThrill = thrill;
		}

		String getThrillLevel() {
			return levelOfThrill;
		}
	}

	/*----------------------------enum--------------------------*/
	public ThrillLevel getThrillLevel() {
		return levelOfThrill;
	}

	private double calculateAvgVisitsPerDay() {// 12 hours
		return numOfVisitsPerDay / 12;
	}

	

}
