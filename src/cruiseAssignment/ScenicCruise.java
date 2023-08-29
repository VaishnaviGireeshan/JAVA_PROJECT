package cruiseAssignment;

public class ScenicCruise extends Cruise {

	public ScenicCruise() {
		super("Scenic Cruise", 43.99, 12.99, 3); 

	}

	@Override
	public double calculateAdultPrice(int numAdults) {
		return adultPrice * numDays * numAdults;

	}

	@Override
	public double calculateChildPrice(int numChildren) {
		return childPrice * numDays * numChildren;
	}

}
