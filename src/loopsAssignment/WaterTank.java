package loopsAssignment;

public class WaterTank {
	int tankCapacity, currentTankCapacity;

	void fillingTank() {
		while (tankCapacity < 100) {
			tankCapacity += 10;
			if (tankCapacity > 100) {
				// System.out.println("TANK IS FULL ");
				break;
			} else {
				

				System.out.println("TANK CAPACITY REACHED " + tankCapacity + " LITRES");
			
			}

		}

	}
}
