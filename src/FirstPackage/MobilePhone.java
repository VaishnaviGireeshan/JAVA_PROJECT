package FirstPackage;

public class MobilePhone {
	String brandNmae;
	int modelNumber;
	double screenSizeInInches;
	int storageCapacity;
	String operatingSystem;
	boolean isCameraPresent;
	
	
	void makeCalls() {
		System.out.println("Making calls from "+brandNmae+modelNumber); //Concatenation
	}
	void textMessages() {
		System.out.println("Sending text message using "+brandNmae+modelNumber);
	}
	void takePictures() {
		System.out.println("Taking pictures using "+brandNmae+modelNumber);
	}
}
