package cruiseAssignment;

public class SunsetCruise extends Cruise {

	public SunsetCruise() {
		super("Sunset Cruise", 52.99, 15.99, 1);

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
