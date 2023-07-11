package loopsAssignment;

public class WaterTank {
	int currentTankCapacity, tankCapacity, bucketCount,safeCapacity;

	void fillingTank() {
		tankCapacity=tankCapacity-safeCapacity;
		while (currentTankCapacity <= tankCapacity) {
			currentTankCapacity += 10;
			if (currentTankCapacity > tankCapacity) {
				System.out.println("TANK OVERFLOW, CAN'T POUR MORE WATER!!! ");
				break;
			} else {
				bucketCount++;

				System.out.println("Added " + bucketCount + " bucket, Tank capacity reached " + currentTankCapacity + " Litres");

			}

		}

	}
}
