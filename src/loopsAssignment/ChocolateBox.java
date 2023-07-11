package loopsAssignment;

public class ChocolateBox {
	int chocolateCount,boxCapacity,addingCount;

	void addingChocolatesToBox() {
		while (chocolateCount <= boxCapacity) {
			chocolateCount += 5;
			if (chocolateCount > boxCapacity) {
				System.out.println("CANT'T ADD "+addingCount+" MORE,BOX OVERFLOW!!!");
				break;
			} else {

				System.out.println("Number of chocolates in the box is " + chocolateCount);

			}
		}

	}

}
