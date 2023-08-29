package cruiseAssignment;

abstract class Cruise {
	String cruiseName;
	double adultPrice;
	double childPrice;
	int numDays;

	public Cruise(String cruiseName, double adultPrice, double childPrice, int days) {
		this.cruiseName = cruiseName;
		this.adultPrice = adultPrice;
		this.childPrice = childPrice;
		this.numDays = days;

	}
	//abstract method  implemented in  subclasses
	public abstract double calculateAdultPrice(int numAdults);

	public abstract double calculateChildPrice(int numChildren);

}
