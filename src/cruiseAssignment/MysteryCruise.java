package cruiseAssignment;

public class MysteryCruise extends Cruise{

	public MysteryCruise() {
		super("Mystery Cruise", 45.99, 12.99, 2);

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
