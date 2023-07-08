package loopsAssignment;

public class ChocolateBox {
	int chocolateCount;
	void addingChocolates() {
		while(chocolateCount<=63) {
			chocolateCount +=5;
			if(chocolateCount>63) {
				System.out.println("Can't add more chocolate");
				break;
			}
			 else {
					

					System.out.println("Number of chocolates in the box is " + chocolateCount );
				
				}
		}
			
	}

}
