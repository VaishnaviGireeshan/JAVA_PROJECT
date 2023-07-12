package loopsAssignment;

public class WaterTank {
	double initialWaterLevel;// Current water level in the tank
	int maxCapacity;// Maximum Tank capacity
	int bucketCpacity;// bucket capacity
	int bucketCount;
	int safeDeductionCapacity;

	void fillingTank() {

		while (initialWaterLevel <= maxCapacity) {
			initialWaterLevel += bucketCpacity;
			bucketCount++;
			double reminingCapacity = maxCapacity - initialWaterLevel;
			if (reminingCapacity < safeDeductionCapacity) {
				System.out.println("Water level reached maximum, Can't Pour more water!!!");

				break;
			}

			else {
				System.out.println(+bucketCount + " Bucket poured, water level reached " + initialWaterLevel);
			}
		}

	}
}
