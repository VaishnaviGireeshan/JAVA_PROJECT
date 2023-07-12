package loopsAssignment;

public class WaterTankMain {

	public static void main(String[] args) {
		WaterTank wt = new WaterTank();
		wt.initialWaterLevel = 12.5;
		wt.bucketCpacity = 10;
		wt.safeDeductionCapacity = 5;
		wt.maxCapacity = 100;
		wt.fillingTank();

	}

}
