package cruiseAssignment;

public class DiscoveryCruise extends Cruise {

	public DiscoveryCruise() {
		super("Discovery Cruise", 39.99, 9.99, 4);
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
