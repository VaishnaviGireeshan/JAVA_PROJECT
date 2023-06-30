package FirstPackage;
 
public class Laptop {
	String brandName;
	String modelNumber;
	int ramSize;
	double screenSize;
	boolean isUptodate;
	
	void turnOn() {
		System.out.println("Turn on "+brandName +" " +modelNumber);
	}
	void openBrowser() {
		System.out.println("Oben browser in "+brandName +" " +modelNumber);
	}
	void sendEmail() {
		System.out.println("Sending email using " +brandName +" " +modelNumber);
	}
	void status() {
		System.out.println("Is Laptop is Uptodate? "  +brandName +" " +modelNumber +" is uptodate" );
	}

}
