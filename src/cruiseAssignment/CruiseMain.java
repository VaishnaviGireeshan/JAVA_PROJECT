package cruiseAssignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CruiseMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user = new User();
		Cruise[] cruises = { new ScenicCruise(), new SunsetCruise(), new DiscoveryCruise(), new MysteryCruise() };

		// System.out.println("Costa Cruises\n----------------");
		try {
			user.signUp();
			user.logIn();
			//System.out.println("Please enter the service you want to book\n Hotel Stay\nCruise");
			//String serviceChoice = sc.nextLine();

			boolean continueSelectingCruise = true;

			while (continueSelectingCruise) {
				System.out.println("We offer " + cruises.length + " different packages as displayed below.");
				for (Cruise cruise : cruises) {
					System.out.println(cruise.cruiseName);
				}
				System.out.println("Please enter the cruise that you want to select,\n");
				String selectedCruiseName = sc.nextLine();

				Cruise selectedCruise = null;
				for (Cruise cruise : cruises) {
					if (cruise.cruiseName.equalsIgnoreCase(selectedCruiseName)) {
						selectedCruise = cruise;
						break;
					}
				}

				if (selectedCruise != null) {
					DecimalFormat df = new DecimalFormat("0.00");
					PriceCalculator priceCalculator = new PriceCalculator();

					System.out.println("\nYou've selected " + selectedCruise.cruiseName + " which is a "
							+ selectedCruise.numDays + " day cruise");
					System.out.println(
							"Price for Adults (greater than 12)   : " + selectedCruise.adultPrice + " per day ");
					System.out.println(
							"Price for Kids (Above 5)             : " + selectedCruise.childPrice + " per day ");

					System.out.println("\nEnter the number of adults: ");
					int numAdults = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter the number of children: ");
					int numChildren = sc.nextInt();
					sc.nextLine();

					System.out.println(
							"\nWe have delicious meals which you can try while you enjoy the beautiful view\nDo you want to pre-book meals? (Yes/No): ");
					String mealChoice = sc.nextLine();

					double adultMealPrice = 0;
					double childMealPrice = 0;

					if (mealChoice.equalsIgnoreCase("Yes")) {
						System.out.println("Meal menu\n---------\nAdults  $20.99 per day \nKids  $4.99 per day");

						adultMealPrice = priceCalculator.getAdultMealPrice(selectedCruise.numDays, numAdults);
						childMealPrice = priceCalculator.getChildMealPrice(selectedCruise.numDays, numChildren);
					}

					double ticketPrice = priceCalculator.calculateTicketPrice(selectedCruise, numAdults, numChildren);
					double totalPrice = priceCalculator.calculateTotalPrice(ticketPrice, adultMealPrice,
							childMealPrice);
					double tax = priceCalculator.calculateTax(totalPrice);
					double finalPrice = priceCalculator.calculateFinalPrice(totalPrice, tax);

					System.out.println("\nCheckout Details\n----------------\n" + selectedCruise.cruiseName);
					System.out.println("Adults Ticket Price " + numAdults + " : $"
							+ df.format(selectedCruise.calculateAdultPrice(numAdults)));
					System.out.println("Child Ticket Price  " + numChildren + " : $"
							+ df.format(selectedCruise.calculateChildPrice(numChildren)));

					if (mealChoice.equalsIgnoreCase("Yes")) {
						System.out.println("Meals Price Adults  " + numAdults + "     : $" + df.format(adultMealPrice));
						System.out.println("Meals Price Children  " + numChildren + " : $" + df.format(childMealPrice));
					}

					System.out.println("\nTotal Price : $" + df.format(totalPrice));
					System.out.println("HST  15% : $" + df.format(tax));
					System.out.println("Final Price : $" + df.format(finalPrice));
					user.upadteUserDetails();
				} else {
					System.out.println("Invalid cruise selection.");
				}
				System.out.print("\nDo you want to select another cruise? (Yes/No): ");
				String choice = sc.nextLine();
				if (!choice.equalsIgnoreCase("Yes")) {
					continueSelectingCruise = false; // Exit the loop if the user doesn't want to select another cruise
				}

			} // while
		} catch (CredentialException e) {
			System.out.println("Error: " + e.getMessage());
			return; // Stop the execution
		}
		sc.close();
	}

}
