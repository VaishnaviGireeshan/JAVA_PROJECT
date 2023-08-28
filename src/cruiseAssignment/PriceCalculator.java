package cruiseAssignment;

public class PriceCalculator implements MealsOptions {

   public double calculateTicketPrice(Cruise cruise, int numAdults, int numChildren) {
       double adultPrice = cruise.calculateAdultPrice(numAdults);
       double childPrice = cruise.calculateChildPrice(numChildren);
        
      return adultPrice + childPrice;
    }

    public double calculateTotalPrice(double ticketPrice, double adultMealPrice, double childMealPrice) {
        return ticketPrice + adultMealPrice + childMealPrice;
    }

    public double calculateTax(double totalPrice) {
        return 0.15 * totalPrice;
    }

    public double calculateFinalPrice(double totalPrice, double tax) {
        return totalPrice + tax;
    }

    @Override
    public double getAdultMealPrice(int numDays, int numPeople) {
        return 20.99 * numDays * numPeople;
    }

    @Override
    public double getChildMealPrice(int numDays, int numPeople) {
        return 4.99 * numDays * numPeople;
    }

	
}
